package com.engagelab.privates.common.binder;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.engagelab.privates.common.MTCommon;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.business.MTCommonBusiness;
import com.engagelab.privates.common.cache.MTCommonConfig;
import com.engagelab.privates.common.component.MTCommonService;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class MTMessenger {
    private static final String TAG = "MTMessenger";
    private static volatile MTMessenger instance;
    private Messenger mainMessenger;
    private Messenger remoteMessenger;
    private boolean serviceFlag = false;
    private boolean isInitOnMainProcess = false;
    private final ConcurrentLinkedQueue<Message> mainMessageQueue = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<Message> remoteMessageQueue = new ConcurrentLinkedQueue<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean initConfig(Context context) {
        String appKey = MTGlobal.getAppKey(context);
        if (TextUtils.isEmpty(appKey)) {
            MTCommonLog.e(TAG, "appKey is empty, please check it");
            return false;
        }
        String appChannel = MTGlobal.getAppChannel(context);
        String appProcess = MTGlobal.getAppProcess(context);
        String appVersionName = MTGlobal.getAppVersionName(context);
        MTCommonLog.d(TAG, "appVersionCode:" + MTGlobal.getAppVersionCode(context) + ", appVersionName:" + appVersionName + ", appKey:" + appKey + ", appChannel:" + appChannel + ", appProcess:" + appProcess);
        MTCommonConfig.setSdkVersionName(context, "4.3.9");
        MTCommonConfig.setSdkVersionCode(context, 439);
        MTCommonConfig.setAppKey(context, appKey);
        MTCommonConfig.setAppChannel(context, appChannel);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IBinder getBinder() {
        return this.remoteMessenger.getBinder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onServiceConnected(Context context, IBinder iBinder) {
        MTCommonLog.i(TAG, "onServiceConnected");
        this.serviceFlag = true;
        MTCommonBusiness.getInstance().init(context);
        this.remoteMessenger = new Messenger(iBinder);
        try {
            Iterator<Message> it = this.remoteMessageQueue.iterator();
            while (it.hasNext()) {
                this.remoteMessenger.send(it.next());
                it.remove();
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "sendMessageToRemoteProcess failed " + th.getMessage());
        }
        sendMessageToMainProcess(context, 1001, null);
        sendMessageToRemoteProcess(context, MTCommonConstants.RemoteWhat.ON_SERVICE_CONNECTED, null);
        sendMessageToRemoteProcess(context, MTCommonConstants.RemoteWhat.START_CONNECT, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onServiceDisconnected(Context context) {
        MTCommonLog.i(TAG, "onServiceDisconnected");
        this.serviceFlag = false;
        this.mainMessenger = null;
        this.remoteMessenger = null;
        this.mainMessageQueue.clear();
        this.remoteMessageQueue.clear();
        if (this.isInitOnMainProcess) {
            MTCommonLog.i(TAG, "onServiceDisconnected retry init");
            MTCommonPrivatesApi.sendMessageDelayed(context, MTCommon.THREAD_COMMON, 1000, null, 3000L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void sendMessageToMainProcess(Context context, int i, Bundle bundle) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.setData(bundle);
            Messenger messenger = this.mainMessenger;
            if (messenger != null) {
                messenger.send(messageObtain);
                return;
            }
            this.mainMessageQueue.add(messageObtain);
            if (this.isInitOnMainProcess) {
                MTCommonPrivatesApi.sendMessage(context, MTCommon.THREAD_COMMON, 1000, null);
            }
        } catch (DeadObjectException e) {
            MTCommonLog.w(TAG, "sendMessageToMainProcess DeadObjectException " + e.getMessage());
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "sendMessageToMainProcess failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void sendMessageToRemoteProcess(Context context, int i, Bundle bundle) {
        try {
            if (MTGlobal.isNeedRemoteProcess) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.setData(bundle);
                if (MTGlobal.isMainProcess(context)) {
                    messageObtain.replyTo = this.mainMessenger;
                }
                Messenger messenger = this.remoteMessenger;
                if (messenger == null) {
                    this.remoteMessageQueue.add(messageObtain);
                } else {
                    messenger.send(messageObtain);
                }
            }
        } catch (DeadObjectException e) {
            MTCommonLog.w(TAG, "sendMessageToRemoteProcess DeadObjectException " + e.getMessage());
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "sendMessageToRemoteProcess failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static MTMessenger getInstance() {
        if (instance == null) {
            synchronized (MTMessenger.class) {
                instance = new MTMessenger();
            }
        }
        return instance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void initOnMainProcess(Context context) {
        try {
            if (this.mainMessenger == null) {
                MTCommonLog.i(TAG, "init common version:4.3.9");
                if (!initConfig(context)) {
                    return;
                }
                this.mainMessenger = new Messenger(new MainMessengerHandler(context, Looper.getMainLooper()));
                Iterator<Message> it = this.mainMessageQueue.iterator();
                while (it.hasNext()) {
                    this.mainMessenger.send(it.next());
                    it.remove();
                }
            }
            if (MTGlobal.isNeedRemoteProcess && !this.serviceFlag) {
                this.serviceFlag = true;
                this.isInitOnMainProcess = true;
                if (MTGlobal.getCommonService(context) == null) {
                    MTCommonLog.e(TAG, "MTCommonService is null, please create new Service extends MTCommonService");
                    return;
                }
                MTMessengerConnection mTMessengerConnection = new MTMessengerConnection(context);
                MTCommonService commonService = MTGlobal.getCommonService(context);
                if (commonService == null) {
                    MTCommonLog.e(TAG, "initOnMainProcess error, there are no service extends MTCommonService");
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(context, commonService.getClass());
                context.bindService(intent, mTMessengerConnection, 1);
                if (Build.VERSION.SDK_INT < 26) {
                    context.startService(intent);
                }
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "initOnMainProcess failed " + th.getMessage());
        }
    }

    public void initMainMessenger(Messenger messenger) {
        if (messenger == null) {
            return;
        }
        try {
            this.mainMessenger = messenger;
            Iterator<Message> it = this.mainMessageQueue.iterator();
            while (it.hasNext()) {
                this.mainMessenger.send(it.next());
                it.remove();
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "initMainMessenger failed " + th.getMessage());
        }
    }

    public void initOnRemoteProcess(Context context) {
        try {
            if (this.remoteMessenger != null) {
                return;
            }
            MTGlobal.isNeedRemoteProcess = true;
            MTCommonLog.i(TAG, "init common version:4.3.9");
            if (initConfig(context)) {
                this.remoteMessenger = new Messenger(new RemoteMessengerHandler(context, Looper.getMainLooper()));
                Iterator<Message> it = this.remoteMessageQueue.iterator();
                while (it.hasNext()) {
                    this.remoteMessenger.send(it.next());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "initOnRemoteProcess failed " + th.getMessage());
        }
    }
}
