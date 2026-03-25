package com.just.agentweb.filechooser;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.just.agentweb.AbsAgentWebUIController;
import com.just.agentweb.Action;
import com.just.agentweb.ActionActivity;
import com.just.agentweb.AgentWebConfig;
import com.just.agentweb.AgentWebPermissions;
import com.just.agentweb.AgentWebUtils;
import com.just.agentweb.PermissionInterceptor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class FileChooser {
    public static int MAX_WAIT_PHOTO_MS = 8000;
    public static final int REQUEST_CODE = 596;
    private static final String TAG = "FileChooser";
    private String mAcceptType;
    private Activity mActivity;
    private WeakReference<AbsAgentWebUIController> mAgentWebUIController;
    private WebChromeClient.FileChooserParams mFileChooserParams;
    private boolean mIsAboveLollipop;
    private boolean mJsChannel;
    private JsChannelCallback mJsChannelCallback;
    private Handler.Callback mJsChannelHandler$Callback;
    private ValueCallback<Pair<String, Uri>> mPathCallback;
    private PermissionInterceptor mPermissionInterceptor;
    private ValueCallback<Uri> mUriValueCallback;
    private ValueCallback<Uri[]> mUriValueCallbacks;
    private WebView mWebView;
    private boolean mCameraState = false;
    private boolean mVideoState = false;
    private int FROM_INTENTION_CODE = 21;
    private ActionActivity.PermissionListener mPermissionListener = new ActionActivity.PermissionListener() { // from class: com.just.agentweb.filechooser.FileChooser.4
        @Override // com.just.agentweb.ActionActivity.PermissionListener
        public void onRequestPermissionsResult(@NonNull String[] strArr, @NonNull int[] iArr, Bundle bundle) {
            FileChooser.this.permissionResult(AgentWebUtils.hasPermission(FileChooser.this.mActivity, (List<String>) Arrays.asList(strArr)), bundle.getInt(ActionActivity.KEY_FROM_INTENTION));
        }
    };

    public FileChooser(Builder builder) {
        this.mIsAboveLollipop = false;
        this.mJsChannel = false;
        this.mAgentWebUIController = null;
        this.mAcceptType = "*/*";
        this.mActivity = builder.mActivity;
        this.mUriValueCallback = builder.mUriValueCallback;
        this.mUriValueCallbacks = builder.mUriValueCallbacks;
        this.mPathCallback = builder.mPathCallback;
        this.mIsAboveLollipop = builder.mIsAboveLollipop;
        this.mJsChannel = builder.mJsChannel;
        this.mFileChooserParams = builder.mFileChooserParams;
        if (this.mJsChannel) {
            this.mJsChannelCallback = JsChannelCallback.create(builder.mJsChannelCallback);
        }
        this.mWebView = builder.mWebView;
        this.mPermissionInterceptor = builder.mPermissionInterceptor;
        this.mAcceptType = builder.mAcceptType;
        this.mAgentWebUIController = new WeakReference<>(AgentWebUtils.getAgentWebUIControllerByWebView(this.mWebView));
        this.mJsChannelHandler$Callback = builder.mJsChannelCallback;
    }

    public void openFileChooser() {
        if (!AgentWebUtils.isUIThread()) {
            AgentWebUtils.runInUiThread(new Runnable() { // from class: com.just.agentweb.filechooser.FileChooser.1
                @Override // java.lang.Runnable
                public void run() {
                    FileChooser.this.openFileChooser();
                }
            });
        } else {
            openFileChooserInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileChooser() {
        Activity activity = this.mActivity;
        String[] strArr = AgentWebPermissions.STORAGE;
        if (AgentWebUtils.getDeniedPermissions(activity, strArr).isEmpty()) {
            touchOffFileChooserAction();
            return;
        }
        Action actionCreatePermissionsAction = Action.createPermissionsAction(strArr);
        actionCreatePermissionsAction.setFromIntention(this.FROM_INTENTION_CODE >> 2);
        ActionActivity.setPermissionListener(this.mPermissionListener);
        ActionActivity.start(this.mActivity, actionCreatePermissionsAction);
    }

    private void touchOffFileChooserAction() {
        Action action = new Action();
        action.setAction(2);
        ActionActivity.setChooserListener(getChooserListener());
        this.mActivity.startActivity(new Intent(this.mActivity, (Class<?>) ActionActivity.class).putExtra(ActionActivity.KEY_ACTION, action).putExtra(ActionActivity.KEY_FILE_CHOOSER_INTENT, getFileChooserIntent()));
    }

    private Intent getFileChooserIntent() {
        WebChromeClient.FileChooserParams fileChooserParams;
        Intent intentCreateIntent;
        if (this.mIsAboveLollipop && (fileChooserParams = this.mFileChooserParams) != null && (intentCreateIntent = fileChooserParams.createIntent()) != null) {
            if (intentCreateIntent.getAction().equals("android.intent.action.GET_CONTENT")) {
                intentCreateIntent.setAction("android.intent.action.OPEN_DOCUMENT");
            }
            if (TextUtils.isEmpty(this.mAcceptType)) {
                intentCreateIntent.setType("*/*");
            } else {
                intentCreateIntent.setType(this.mAcceptType);
            }
            return intentCreateIntent;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (TextUtils.isEmpty(this.mAcceptType)) {
            intent.setType("*/*");
        } else {
            intent.setType(this.mAcceptType);
        }
        intent.addFlags(1);
        return Intent.createChooser(intent, "");
    }

    private ActionActivity.ChooserListener getChooserListener() {
        return new ActionActivity.ChooserListener() { // from class: com.just.agentweb.filechooser.FileChooser.2
            @Override // com.just.agentweb.ActionActivity.ChooserListener
            public void onChoiceResult(int i, int i2, Intent intent) {
                FileChooser.this.onIntentResult(i, i2, intent);
            }
        };
    }

    private void openFileChooserInternal() {
        WebChromeClient.FileChooserParams fileChooserParams;
        if (this.mIsAboveLollipop && (fileChooserParams = this.mFileChooserParams) != null && fileChooserParams.getAcceptTypes() != null) {
            String[] acceptTypes = this.mFileChooserParams.getAcceptTypes();
            int length = acceptTypes.length;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i < length) {
                    String str = acceptTypes[i];
                    if (!TextUtils.isEmpty(str)) {
                        if (str.contains("*/") || str.contains("image/")) {
                            break;
                        } else if (str.contains("video/")) {
                            z = true;
                            this.mVideoState = true;
                        }
                    }
                    i++;
                } else if (!z) {
                    touchOffFileChooserAction();
                    return;
                }
            }
        }
        if (!TextUtils.isEmpty(this.mAcceptType) && !this.mAcceptType.contains("*/") && !this.mAcceptType.contains("image/")) {
            touchOffFileChooserAction();
        } else if (this.mAgentWebUIController.get() != null) {
            AbsAgentWebUIController absAgentWebUIController = this.mAgentWebUIController.get();
            WebView webView = this.mWebView;
            absAgentWebUIController.onSelectItemsPrompt(webView, webView.getUrl(), new String[]{this.mActivity.getString(R.string.agentweb_camera), this.mActivity.getString(R.string.agentweb_file_chooser)}, getCallBack());
        }
    }

    private Handler.Callback getCallBack() {
        return new Handler.Callback() { // from class: com.just.agentweb.filechooser.FileChooser.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    FileChooser.this.mCameraState = true;
                    FileChooser.this.onCameraAction();
                } else if (i != 1) {
                    FileChooser.this.cancel();
                } else {
                    FileChooser.this.mCameraState = false;
                    FileChooser.this.fileChooser();
                }
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCameraAction() {
        if (this.mActivity == null) {
            return;
        }
        PermissionInterceptor permissionInterceptor = this.mPermissionInterceptor;
        if (permissionInterceptor != null && permissionInterceptor.intercept(this.mWebView.getUrl(), AgentWebPermissions.CAMERA, "camera")) {
            cancel();
            return;
        }
        Action action = new Action();
        List<String> listCheckNeedPermission = checkNeedPermission();
        if (!listCheckNeedPermission.isEmpty()) {
            action.setAction(1);
            action.setPermissions((String[]) listCheckNeedPermission.toArray(new String[0]));
            action.setFromIntention(this.FROM_INTENTION_CODE >> 3);
            ActionActivity.setPermissionListener(this.mPermissionListener);
            ActionActivity.start(this.mActivity, action);
            return;
        }
        openCameraAction();
    }

    private List<String> checkNeedPermission() {
        ArrayList arrayList = new ArrayList();
        Activity activity = this.mActivity;
        String[] strArr = AgentWebPermissions.CAMERA;
        if (!AgentWebUtils.hasPermission(activity, strArr)) {
            arrayList.add(strArr[0]);
        }
        Activity activity2 = this.mActivity;
        String[] strArr2 = AgentWebPermissions.STORAGE;
        if (!AgentWebUtils.hasPermission(activity2, strArr2)) {
            arrayList.addAll(Arrays.asList(strArr2));
        }
        return arrayList;
    }

    private void openCameraAction() {
        Action action = new Action();
        if (this.mVideoState) {
            action.setAction(4);
        } else {
            action.setAction(3);
        }
        ActionActivity.setChooserListener(getChooserListener());
        ActionActivity.start(this.mActivity, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void permissionResult(boolean z, int i) {
        int i2 = this.FROM_INTENTION_CODE;
        if (i == (i2 >> 2)) {
            if (z) {
                touchOffFileChooserAction();
                return;
            }
            cancel();
            if (this.mAgentWebUIController.get() != null) {
                this.mAgentWebUIController.get().onPermissionsDeny(AgentWebPermissions.STORAGE, AgentWebPermissions.ACTION_STORAGE, "Open file chooser");
                return;
            }
            return;
        }
        if (i == (i2 >> 3)) {
            if (z) {
                openCameraAction();
                return;
            }
            cancel();
            if (this.mAgentWebUIController.get() != null) {
                this.mAgentWebUIController.get().onPermissionsDeny(AgentWebPermissions.CAMERA, AgentWebPermissions.ACTION_CAMERA, "Take photo");
            }
        }
    }

    public void onIntentResult(int i, int i2, Intent intent) {
        if (596 != i) {
            return;
        }
        if (i2 == 0 || intent == null) {
            cancel();
            return;
        }
        if (i2 != -1) {
            cancel();
            return;
        }
        if (this.mJsChannel) {
            convertFileAndCallback(this.mCameraState ? new Uri[]{(Uri) intent.getParcelableExtra(ActionActivity.KEY_URI)} : processData(intent));
            return;
        }
        if (this.mIsAboveLollipop) {
            aboveLollipopCheckFilesAndCallback(this.mCameraState ? new Uri[]{(Uri) intent.getParcelableExtra(ActionActivity.KEY_URI)} : processData(intent), this.mCameraState);
            return;
        }
        ValueCallback<Uri> valueCallback = this.mUriValueCallback;
        if (valueCallback == null) {
            cancel();
        } else if (this.mCameraState) {
            valueCallback.onReceiveValue((Uri) intent.getParcelableExtra(ActionActivity.KEY_URI));
        } else {
            belowLollipopUriCallback(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancel() {
        if (this.mJsChannel) {
            this.mJsChannelCallback.call(null);
            return;
        }
        ValueCallback<Uri> valueCallback = this.mUriValueCallback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        ValueCallback<Uri[]> valueCallback2 = this.mUriValueCallbacks;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
    }

    private void belowLollipopUriCallback(Intent intent) {
        if (intent == null) {
            ValueCallback<Uri> valueCallback = this.mUriValueCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(Uri.EMPTY);
                return;
            }
            return;
        }
        Uri data = intent.getData();
        ValueCallback<Uri> valueCallback2 = this.mUriValueCallback;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(data);
        }
    }

    private Uri[] processData(Intent intent) {
        Uri[] uriArr = null;
        if (intent == null) {
            return null;
        }
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            return new Uri[]{Uri.parse(dataString)};
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null && clipData.getItemCount() > 0) {
            uriArr = new Uri[clipData.getItemCount()];
            for (int i = 0; i < clipData.getItemCount(); i++) {
                uriArr[i] = clipData.getItemAt(i).getUri();
            }
        }
        return uriArr;
    }

    private void convertFileAndCallback(Uri[] uriArr) {
        String[] strArrUriToPath;
        if (uriArr == null || uriArr.length == 0 || (strArrUriToPath = AgentWebUtils.uriToPath(this.mActivity, uriArr)) == null || strArrUriToPath.length == 0) {
            this.mJsChannelCallback.call(null);
            return;
        }
        int length = 0;
        for (String str : strArrUriToPath) {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists()) {
                    length = (int) (((long) length) + file.length());
                }
            }
        }
        if (length > AgentWebConfig.MAX_FILE_LENGTH) {
            if (this.mAgentWebUIController.get() != null) {
                this.mAgentWebUIController.get().onShowMessage(this.mActivity.getString(R.string.agentweb_max_file_length_limit, ((AgentWebConfig.MAX_FILE_LENGTH / 1024) / 1024) + ""), "convertFileAndCallback");
            }
            this.mJsChannelCallback.call(null);
            return;
        }
        new CovertFileThread(this.mJsChannelCallback, strArrUriToPath).start();
    }

    private void aboveLollipopCheckFilesAndCallback(Uri[] uriArr, boolean z) {
        if (this.mUriValueCallbacks == null) {
            return;
        }
        String[] strArrUriToPath = AgentWebUtils.uriToPath(this.mActivity, uriArr);
        if (strArrUriToPath != null && strArrUriToPath.length > 0) {
            this.mPathCallback.onReceiveValue(Pair.create(strArrUriToPath[0], uriArr[0]));
        }
        if (!z) {
            if (Build.VERSION.SDK_INT >= 30 && uriArr != null && uriArr.length > 0) {
                for (Uri uri : uriArr) {
                    this.mActivity.getContentResolver().takePersistableUriPermission(uri, 1);
                }
            }
            ValueCallback<Uri[]> valueCallback = this.mUriValueCallbacks;
            if (uriArr == null) {
                uriArr = new Uri[0];
            }
            valueCallback.onReceiveValue(uriArr);
            return;
        }
        if (this.mAgentWebUIController.get() == null) {
            this.mUriValueCallbacks.onReceiveValue(null);
            return;
        }
        if (strArrUriToPath == null || strArrUriToPath.length == 0) {
            this.mUriValueCallbacks.onReceiveValue(null);
            return;
        }
        String str = strArrUriToPath[0];
        this.mAgentWebUIController.get().onLoading(this.mActivity.getString(R.string.agentweb_loading));
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new WaitPhotoRunnable(str, new AboveLCallback(this.mUriValueCallbacks, uriArr, this.mAgentWebUIController)));
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class AboveLCallback implements Handler.Callback {
        private WeakReference<AbsAgentWebUIController> controller;
        private Uri[] mUris;
        private ValueCallback<Uri[]> mValueCallback;

        private AboveLCallback(ValueCallback<Uri[]> valueCallback, Uri[] uriArr, WeakReference<AbsAgentWebUIController> weakReference) {
            this.mValueCallback = valueCallback;
            this.mUris = uriArr;
            this.controller = weakReference;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(final Message message) {
            AgentWebUtils.runInUiThread(new Runnable() { // from class: com.just.agentweb.filechooser.FileChooser.AboveLCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    AboveLCallback.this.safeHandleMessage(message);
                }
            });
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void safeHandleMessage(Message message) {
            ValueCallback<Uri[]> valueCallback = this.mValueCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(this.mUris);
            }
            WeakReference<AbsAgentWebUIController> weakReference = this.controller;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.controller.get().onCancelLoading();
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class WaitPhotoRunnable implements Runnable {
        private Handler.Callback mCallback;
        private String path;

        private WaitPhotoRunnable(String str, Handler.Callback callback) {
            this.path = str;
            this.mCallback = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler.Callback callback;
            if (TextUtils.isEmpty(this.path) || !new File(this.path).exists()) {
                Handler.Callback callback2 = this.mCallback;
                if (callback2 != null) {
                    callback2.handleMessage(Message.obtain((Handler) null, -1));
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                if (i > FileChooser.MAX_WAIT_PHOTO_MS) {
                    break;
                }
                i += 300;
                SystemClock.sleep(300L);
                if (new File(this.path).length() > 0) {
                    Handler.Callback callback3 = this.mCallback;
                    if (callback3 != null) {
                        callback3.handleMessage(Message.obtain((Handler) null, 1));
                        this.mCallback = null;
                    }
                }
            }
            if (i > FileChooser.MAX_WAIT_PHOTO_MS && (callback = this.mCallback) != null) {
                callback.handleMessage(Message.obtain((Handler) null, -1));
            }
            this.mCallback = null;
            this.path = null;
        }
    }

    public static Queue<FileParcel> convertFile(String[] strArr) throws Exception {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int i = 1;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        if (strArr.length <= iAvailableProcessors) {
            iAvailableProcessors = strArr.length;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(iAvailableProcessors);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        CountDownLatch countDownLatch = new CountDownLatch(strArr.length);
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                countDownLatch.countDown();
            } else {
                executorServiceNewFixedThreadPool.execute(new EncodeFileRunnable(str, linkedBlockingQueue, countDownLatch, i));
                i++;
            }
        }
        countDownLatch.await();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorServiceNewFixedThreadPool;
        if (!threadPoolExecutor.isShutdown()) {
            threadPoolExecutor.shutdownNow();
        }
        return linkedBlockingQueue;
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static class EncodeFileRunnable implements Runnable {
        private String filePath;
        private int id;
        private CountDownLatch mCountDownLatch;
        private Queue<FileParcel> mQueue;

        public EncodeFileRunnable(String str, Queue<FileParcel> queue, CountDownLatch countDownLatch, int i) {
            this.filePath = str;
            this.mQueue = queue;
            this.mCountDownLatch = countDownLatch;
            this.id = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            FileInputStream fileInputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            Throwable th;
            File file;
            byte[] bArr;
            FileInputStream fileInputStream2 = null;
            try {
                file = new File(this.filePath);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    th = th;
                    try {
                        th.printStackTrace();
                        AgentWebUtils.closeIO(fileInputStream);
                        AgentWebUtils.closeIO(byteArrayOutputStream);
                        this.mCountDownLatch.countDown();
                    } catch (Throwable th4) {
                        AgentWebUtils.closeIO(fileInputStream);
                        AgentWebUtils.closeIO(byteArrayOutputStream);
                        this.mCountDownLatch.countDown();
                        throw th4;
                    }
                }
                try {
                    bArr = new byte[1024];
                } catch (Throwable th5) {
                    th = th5;
                    th.printStackTrace();
                    AgentWebUtils.closeIO(fileInputStream);
                }
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 1024);
                    if (i == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    AgentWebUtils.closeIO(byteArrayOutputStream);
                    this.mCountDownLatch.countDown();
                }
                this.mQueue.offer(new FileParcel(this.id, file.getAbsolutePath(), Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)));
                fileInputStream2 = fileInputStream;
            } else {
                byteArrayOutputStream = null;
            }
            AgentWebUtils.closeIO(fileInputStream2);
            AgentWebUtils.closeIO(byteArrayOutputStream);
            this.mCountDownLatch.countDown();
        }
    }

    public static String convertFileParcelObjectsToJson(Collection<FileParcel> collection) {
        if (collection == null || collection.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FileParcel fileParcel : collection) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("contentPath", fileParcel.getContentPath());
                jSONObject.put("fileBase64", fileParcel.getFileBase64());
                jSONObject.put("mId", fileParcel.getId());
                jSONArray.put(jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONArray + "";
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static class CovertFileThread extends Thread {
        private WeakReference<JsChannelCallback> mJsChannelCallback;
        private String[] paths;

        private CovertFileThread(JsChannelCallback jsChannelCallback, String[] strArr) {
            super("agentweb-thread");
            this.mJsChannelCallback = new WeakReference<>(jsChannelCallback);
            this.paths = strArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                String strConvertFileParcelObjectsToJson = FileChooser.convertFileParcelObjectsToJson(FileChooser.convertFile(this.paths));
                WeakReference<JsChannelCallback> weakReference = this.mJsChannelCallback;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.mJsChannelCallback.get().call(strConvertFileParcelObjectsToJson);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static class JsChannelCallback {
        WeakReference<Handler.Callback> callback;

        public JsChannelCallback(Handler.Callback callback) {
            this.callback = null;
            this.callback = new WeakReference<>(callback);
        }

        public static JsChannelCallback create(Handler.Callback callback) {
            return new JsChannelCallback(callback);
        }

        public void call(String str) {
            WeakReference<Handler.Callback> weakReference = this.callback;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.callback.get().handleMessage(Message.obtain(null, 2077613503, str));
        }
    }

    public static Builder newBuilder(Activity activity, WebView webView) {
        return new Builder().setActivity(activity).setWebView(webView);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Builder {
        private Activity mActivity;
        private WebChromeClient.FileChooserParams mFileChooserParams;
        private Handler.Callback mJsChannelCallback;
        private ValueCallback<Pair<String, Uri>> mPathCallback;
        private PermissionInterceptor mPermissionInterceptor;
        private ValueCallback<Uri> mUriValueCallback;
        private ValueCallback<Uri[]> mUriValueCallbacks;
        private WebView mWebView;
        private boolean mIsAboveLollipop = false;
        private boolean mJsChannel = false;
        private String mAcceptType = "*/*";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setAcceptType(String str) {
            this.mAcceptType = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setActivity(Activity activity) {
            this.mActivity = activity;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setFileChooserParams(WebChromeClient.FileChooserParams fileChooserParams) {
            this.mFileChooserParams = fileChooserParams;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setJsChannelCallback(Handler.Callback callback) {
            this.mJsChannelCallback = callback;
            this.mJsChannel = true;
            this.mUriValueCallback = null;
            this.mUriValueCallbacks = null;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setPathCallback(ValueCallback<Pair<String, Uri>> valueCallback) {
            this.mPathCallback = valueCallback;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setPermissionInterceptor(PermissionInterceptor permissionInterceptor) {
            this.mPermissionInterceptor = permissionInterceptor;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setUriValueCallback(ValueCallback<Uri> valueCallback) {
            this.mUriValueCallback = valueCallback;
            this.mIsAboveLollipop = false;
            this.mJsChannel = false;
            this.mUriValueCallbacks = null;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setUriValueCallbacks(ValueCallback<Uri[]> valueCallback) {
            this.mUriValueCallbacks = valueCallback;
            this.mIsAboveLollipop = true;
            this.mUriValueCallback = null;
            this.mJsChannel = false;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setWebView(WebView webView) {
            this.mWebView = webView;
            return this;
        }

        public FileChooser build() {
            return new FileChooser(this);
        }
    }
}
