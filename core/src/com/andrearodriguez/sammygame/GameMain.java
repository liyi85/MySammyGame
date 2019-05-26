package com.andrearodriguez.sammygame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import scenes.MainMenu;

public class GameMain extends Game {

	public SpriteBatch batch;

	
	@Override
	public void create () {
	    batch = new SpriteBatch();
	    setScreen(new MainMenu(this));

	}

	@Override
	public void render () {
	    super.render();
	}

	public SpriteBatch getBatch() {
		return this.batch;
	}
}
