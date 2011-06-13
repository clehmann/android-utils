/**
 * 
 */
package net.chrislehmann.common.util;

import android.util.Log;

class OnDownloadCompleteHandler implements Runnable
{
   private ImageLoader.Group currentGroup;
   private ImageCache imageCache;
   
   public OnDownloadCompleteHandler(ImageCache cache, ImageLoader.Group group)
   {
      imageCache = cache; 
      currentGroup = group;
   }
   
   public void run()
   {
      Log.d(ImageLoader.LOGTAG, "Loading bitmap for url " + currentGroup.url);
      imageCache.load( this.currentGroup.url, this.currentGroup.image );
      Log.d(ImageLoader.LOGTAG, "Done loading bitmap for url " + currentGroup.url);
      imageCache = null;
      currentGroup = null;
   }
   
}