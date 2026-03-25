package com.okinc.share.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public final class Falcon {
    public static Bitmap OLrzqt(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Parameter activity cannot be null.");
        }
        try {
            return copydefault(activity);
        } catch (Exception e) {
            throw new UnableToTakeScreenshotException("Unable to take screenshot to bitmap of activity " + activity.getClass().getName(), e);
        }
    }

    public static Bitmap copydefault(Activity activity) throws InterruptedException {
        List<TaskDescription> listEZpvd = EZpvd(activity);
        if (listEZpvd.isEmpty()) {
            throw new UnableToTakeScreenshotException("Unable to capture any view data in " + activity);
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (TaskDescription taskDescription : listEZpvd) {
            if (taskDescription.copydefault.right > i) {
                i = taskDescription.copydefault.right;
            }
            if (taskDescription.copydefault.bottom > i2) {
                i2 = taskDescription.copydefault.bottom;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            copydefault(listEZpvd, bitmapCreateBitmap);
        } else {
            OLrzqt(activity, listEZpvd, bitmapCreateBitmap);
        }
        return bitmapCreateBitmap;
    }

    public static void OLrzqt(Activity activity, final List<TaskDescription> list, final Bitmap bitmap) throws InterruptedException {
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        activity.runOnUiThread(new Runnable() { // from class: com.okinc.share.screenshot.Falcon.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        Falcon.copydefault((List<TaskDescription>) list, bitmap);
                    } catch (Exception e) {
                        atomicReference.set(e);
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        countDownLatch.await();
        Exception exc = (Exception) atomicReference.get();
        if (exc != null) {
            throw new UnableToTakeScreenshotException(exc);
        }
    }

    public static void copydefault(List<TaskDescription> list, Bitmap bitmap) {
        Iterator<TaskDescription> it = list.iterator();
        while (it.hasNext()) {
            KWHzl(it.next(), bitmap);
        }
    }

    public static void KWHzl(TaskDescription taskDescription, Bitmap bitmap) {
        if ((taskDescription.OLrzqt.flags & 2) == 2) {
            new Canvas(bitmap).drawARGB((int) (taskDescription.OLrzqt.dimAmount * 255.0f), 0, 0, 0);
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.translate(taskDescription.copydefault.left, taskDescription.copydefault.top);
        taskDescription.AEQbTJ.draw(canvas);
    }

    public static List<TaskDescription> EZpvd(Activity activity) {
        Object objCopydefault = copydefault("mGlobal", activity.getWindowManager());
        Object objCopydefault2 = copydefault("mRoots", objCopydefault);
        List list = (List) copydefault("mParams", objCopydefault);
        List<TaskDescription> listOLrzqt = OLrzqt(((List) objCopydefault2).toArray(), (WindowManager.LayoutParams[]) list.toArray(new WindowManager.LayoutParams[list.size()]));
        if (listOLrzqt.isEmpty()) {
            return Collections.emptyList();
        }
        OLrzqt(listOLrzqt);
        KWHzl(listOLrzqt);
        return listOLrzqt;
    }

    public static List<TaskDescription> OLrzqt(Object[] objArr, WindowManager.LayoutParams[] layoutParamsArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < objArr.length; i++) {
            View view = (View) copydefault("mView", objArr[i]);
            if (view != null && view.isShown()) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                arrayList.add(new TaskDescription(view, new Rect(i2, i3, view.getWidth() + i2, view.getHeight() + i3), layoutParamsArr[i]));
            }
        }
        return arrayList;
    }

    public static void OLrzqt(List<TaskDescription> list) {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (TaskDescription taskDescription : list) {
            if (taskDescription.copydefault.top < i) {
                i = taskDescription.copydefault.top;
            }
            if (taskDescription.copydefault.left < i2) {
                i2 = taskDescription.copydefault.left;
            }
        }
        Iterator<TaskDescription> it = list.iterator();
        while (it.hasNext()) {
            it.next().copydefault.offset(-i2, -i);
        }
    }

    public static void KWHzl(List<TaskDescription> list) {
        if (list.size() <= 1) {
            return;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            TaskDescription taskDescription = list.get(i);
            if (taskDescription.AEQbTJ()) {
                if (taskDescription.copydefault() == null) {
                    return;
                }
                int i2 = i + 1;
                while (true) {
                    if (i2 < list.size()) {
                        TaskDescription taskDescription2 = list.get(i2);
                        if (taskDescription2.KWHzl() && taskDescription2.copydefault() == taskDescription.copydefault()) {
                            list.remove(taskDescription2);
                            list.add(i, taskDescription2);
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public static Object copydefault(String str, Object obj) {
        try {
            return AEQbTJ(str, obj);
        } catch (Exception e) {
            throw new UnableToTakeScreenshotException(e);
        }
    }

    public static Object AEQbTJ(String str, Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field fieldCopydefault = copydefault(str, (Class) obj.getClass());
        fieldCopydefault.setAccessible(true);
        return fieldCopydefault.get(obj);
    }

    public static Field copydefault(String str, Class cls) throws NoSuchFieldException {
        for (Class superclass = cls; superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found for class " + cls);
    }

    private Falcon() {
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class UnableToTakeScreenshotException extends RuntimeException {
        private UnableToTakeScreenshotException(String str) {
            super(str);
        }

        private UnableToTakeScreenshotException(String str, Exception exc) {
            super(str, extractException(exc));
        }

        private UnableToTakeScreenshotException(Exception exc) {
            super(extractException(exc));
        }

        private static Throwable extractException(Exception exc) {
            return exc instanceof UnableToTakeScreenshotException ? exc.getCause() : exc;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class TaskDescription {
        public final View AEQbTJ;
        public final WindowManager.LayoutParams OLrzqt;
        public final Rect copydefault;

        public TaskDescription(View view, Rect rect, WindowManager.LayoutParams layoutParams) {
            this.AEQbTJ = view;
            this.copydefault = rect;
            this.OLrzqt = layoutParams;
        }

        public boolean AEQbTJ() {
            return this.OLrzqt.type == 2;
        }

        public boolean KWHzl() {
            return this.OLrzqt.type == 1;
        }

        public IBinder copydefault() {
            return this.OLrzqt.token;
        }
    }
}
