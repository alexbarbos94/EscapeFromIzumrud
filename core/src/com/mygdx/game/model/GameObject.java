package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Sashunya on 14.09.2017.
 */
 abstract class GameObject {

     Rectangle bounds;
     Sprite object;
     GameObject(Texture texture, float x, float y, float width, float height){
        bounds = new Rectangle(x, y, width, height);
        object = new Sprite(texture);

    }

    public void draw(SpriteBatch batch){
        object.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        object.draw(batch);
    }
}
