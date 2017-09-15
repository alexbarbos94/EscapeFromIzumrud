package com.mygdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.model.MainHero;

public class GameScreen implements Screen {

   private Texture mainHeroTexture;
   private SpriteBatch batch;
   private MainHero mainHero;

    @Override
    public void show() {
        batch = new SpriteBatch();
        mainHeroTexture = new Texture(Gdx.files.internal("mainHero.png"));
        mainHero = new MainHero(mainHeroTexture, 100, 0, 32, 32);
    }


    private float positionY = 0f;
    private float positionX = 0f;


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        positionY++;
        batch.begin();
        mainHero.draw(batch);
        batch.draw(mainHeroTexture, positionX, positionY);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        mainHeroTexture.dispose();
        batch.dispose();
    }
}
