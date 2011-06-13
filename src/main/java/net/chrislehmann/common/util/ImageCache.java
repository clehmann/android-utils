package net.chrislehmann.common.util;

import android.widget.ImageView;

import java.net.URL;

interface ImageCache
{
   public void put(String name, URL image);

   public void clear();

   public void load(String name, ImageView imageView);

   public boolean has(String name);
}