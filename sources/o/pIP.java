package o;

import android.app.Instrumentation;

/* JADX INFO: loaded from: classes9.dex */
public class pIP extends android.app.Instrumentation {
    public android.app.Instrumentation AEQbTJ;

    public pIP(android.app.Instrumentation instrumentation) {
        if (instrumentation == null) {
            throw new java.lang.RuntimeException("instrumentation can not be null!");
        }
        this.AEQbTJ = instrumentation;
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return this.AEQbTJ.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.Class<?> cls, android.content.Context context, android.os.IBinder iBinder, android.app.Application application, android.content.Intent intent, android.content.pm.ActivityInfo activityInfo, java.lang.CharSequence charSequence, android.app.Activity activity, java.lang.String str, java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        return this.AEQbTJ.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public android.app.Application newApplication(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Context context) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return this.AEQbTJ.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(java.lang.String str, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.AEQbTJ.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(android.content.IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.AEQbTJ.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.AEQbTJ.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        this.AEQbTJ.callActivityOnCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle) {
        this.AEQbTJ.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(android.app.Activity activity) {
        this.AEQbTJ.callActivityOnDestroy(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(android.app.Activity activity, android.content.Intent intent) {
        this.AEQbTJ.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(android.app.Activity activity) {
        this.AEQbTJ.callActivityOnPause(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(android.app.Activity activity, android.os.Bundle bundle) {
        this.AEQbTJ.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        this.AEQbTJ.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(android.app.Activity activity) {
        this.AEQbTJ.callActivityOnRestart(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        this.AEQbTJ.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        this.AEQbTJ.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(android.app.Activity activity) {
        this.AEQbTJ.callActivityOnResume(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        this.AEQbTJ.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        this.AEQbTJ.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(android.app.Activity activity) {
        this.AEQbTJ.callActivityOnStart(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(android.app.Activity activity) {
        this.AEQbTJ.callActivityOnStop(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(android.app.Activity activity) {
        this.AEQbTJ.callActivityOnUserLeaving(activity);
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.AEQbTJ.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(android.app.Application application) {
        this.AEQbTJ.callApplicationOnCreate(application);
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        this.AEQbTJ.endPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public void finish(int i, android.os.Bundle bundle) {
        this.AEQbTJ.finish(i, bundle);
    }

    @Override // android.app.Instrumentation
    public android.os.Bundle getAllocCounts() {
        return this.AEQbTJ.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public android.os.Bundle getBinderCounts() {
        return this.AEQbTJ.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public android.content.ComponentName getComponentName() {
        return this.AEQbTJ.getComponentName();
    }

    @Override // android.app.Instrumentation
    public android.content.Context getContext() {
        return this.AEQbTJ.getContext();
    }

    @Override // android.app.Instrumentation
    public android.content.Context getTargetContext() {
        return this.AEQbTJ.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public android.app.UiAutomation getUiAutomation() {
        return this.AEQbTJ.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(android.app.Activity activity, int i, int i2) {
        return this.AEQbTJ.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(android.app.Activity activity, int i, int i2) {
        return this.AEQbTJ.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        return this.AEQbTJ.isProfiling();
    }

    @Override // android.app.Instrumentation
    public void onCreate(android.os.Bundle bundle) {
        this.AEQbTJ.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        this.AEQbTJ.onDestroy();
    }

    @Override // android.app.Instrumentation
    public boolean onException(java.lang.Object obj, java.lang.Throwable th) {
        return this.AEQbTJ.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        this.AEQbTJ.onStart();
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.AEQbTJ.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i) {
        this.AEQbTJ.sendCharacterSync(i);
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(java.lang.Runnable runnable) {
        this.AEQbTJ.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        this.AEQbTJ.sendKeyDownUpSync(i);
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(android.view.MotionEvent motionEvent) {
        this.AEQbTJ.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(android.view.KeyEvent keyEvent) {
        this.AEQbTJ.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i, android.os.Bundle bundle) {
        this.AEQbTJ.sendStatus(i, bundle);
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(java.lang.String str) {
        this.AEQbTJ.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(android.view.MotionEvent motionEvent) {
        this.AEQbTJ.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        this.AEQbTJ.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        this.AEQbTJ.setInTouchMode(z);
    }

    @Override // android.app.Instrumentation
    public void start() {
        this.AEQbTJ.start();
    }

    @Override // android.app.Instrumentation
    public android.app.Activity startActivitySync(android.content.Intent intent) {
        return this.AEQbTJ.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        this.AEQbTJ.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        this.AEQbTJ.startProfiling();
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(java.lang.Runnable runnable) {
        this.AEQbTJ.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        this.AEQbTJ.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        this.AEQbTJ.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public android.app.Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.AEQbTJ.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public android.app.Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        return this.AEQbTJ.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public void startAllocCounting() {
        this.AEQbTJ.startAllocCounting();
    }

    @Override // android.app.Instrumentation
    public void stopAllocCounting() {
        this.AEQbTJ.stopAllocCounting();
    }

    @Override // android.app.Instrumentation
    public void addResults(android.os.Bundle bundle) {
        this.AEQbTJ.addResults(bundle);
    }

    @Override // android.app.Instrumentation
    public java.lang.String getProcessName() {
        return this.AEQbTJ.getProcessName();
    }

    @Override // android.app.Instrumentation
    public android.app.Activity startActivitySync(android.content.Intent intent, android.os.Bundle bundle) {
        return this.AEQbTJ.startActivitySync(intent, bundle);
    }

    @Override // android.app.Instrumentation
    public android.app.UiAutomation getUiAutomation(int i) {
        return this.AEQbTJ.getUiAutomation(i);
    }

    @Override // android.app.Instrumentation
    public android.os.TestLooperManager acquireLooperManager(android.os.Looper looper) {
        return this.AEQbTJ.acquireLooperManager(looper);
    }
}
