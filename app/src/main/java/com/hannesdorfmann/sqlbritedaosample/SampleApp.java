package com.hannesdorfmann.sqlbritedaosample;

import android.app.Application;
import dagger.ObjectGraph;

/**
 * @author Hannes Dorfmann
 */
public class SampleApp extends Application {

  ObjectGraph objectGraph;

  @Override public void onCreate() {
    super.onCreate();
    objectGraph = ObjectGraph.create(new SampleModule(this));
  }

  public ObjectGraph getObjectGraph() {
    return objectGraph;
  }
}
