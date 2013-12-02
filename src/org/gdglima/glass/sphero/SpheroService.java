package org.gdglima.glass.sphero;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SpheroService extends Service {

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		super.onCreate();
		Intent mainIntent = new Intent(SpheroService.this, MainActivity.class);
		mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(mainIntent);
		return START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

}
