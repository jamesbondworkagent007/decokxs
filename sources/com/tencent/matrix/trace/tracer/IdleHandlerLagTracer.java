package com.tencent.matrix.trace.tracer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.annotation.Nullable;
import com.tencent.matrix.AppActiveMatrixDelegate;
import com.tencent.matrix.trace.constants.Constants;
import com.tencent.matrix.trace.util.AppForegroundUtil;
import com.tencent.matrix.util.DeviceUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC58010ytH;
import o.C57911yrO;
import o.C58009ytG;
import o.C58013ytK;
import o.C58038ytj;
import o.C58041ytm;
import o.C58043yto;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class IdleHandlerLagTracer extends AbstractC58010ytH {
    public static C58043yto AEQbTJ;
    public static HandlerThread EZpvd;
    public static Handler KWHzl;
    public static Runnable copydefault;

    public IdleHandlerLagTracer(C58043yto c58043yto) {
        AEQbTJ = c58043yto;
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        super.EZpvd();
        if (AEQbTJ.fIwbmz()) {
            EZpvd = new HandlerThread("IdleHandlerLagThread");
            copydefault = new Activity();
            AEQbTJ();
        }
    }

    public static class Activity implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
                if (c58041ytm == null) {
                    return;
                }
                String strOLrzqt = C58009ytG.OLrzqt();
                boolean zIsInterestingToUser = AppForegroundUtil.isInterestingToUser();
                String visibleScene = AppActiveMatrixDelegate.INSTANCE.getVisibleScene();
                JSONObject jSONObject = new JSONObject();
                DeviceUtil.AEQbTJ(jSONObject, C57911yrO.EZpvd().KWHzl());
                jSONObject.put("detail", Constants.Type.LAG_IDLE_HANDLER);
                jSONObject.put("scene", visibleScene);
                jSONObject.put("threadStack", strOLrzqt);
                jSONObject.put("isProcessForeground", zIsInterestingToUser);
                C58038ytj c58038ytj = new C58038ytj();
                c58038ytj.AEQbTJ("Trace_EvilMethod");
                c58038ytj.KWHzl(jSONObject);
                c58041ytm.OLrzqt(c58038ytj);
                C58013ytK.OLrzqt("Matrix.IdleHandlerLagTracer", "happens idle handler Lag : %s ", jSONObject.toString());
            } catch (Throwable th) {
                C58013ytK.OLrzqt("Matrix.IdleHandlerLagTracer", "Matrix error, error = " + th.getMessage(), new Object[0]);
            }
        }
    }

    public static void AEQbTJ() {
        try {
            MessageQueue queue = Looper.getMainLooper().getQueue();
            Field declaredField = MessageQueue.class.getDeclaredField("mIdleHandlers");
            declaredField.setAccessible(true);
            declaredField.set(queue, new MyArrayList());
            EZpvd.start();
            KWHzl = new Handler(EZpvd.getLooper());
        } catch (Throwable th) {
            C58013ytK.OLrzqt("Matrix.IdleHandlerLagTracer", "reflect idle handler error = " + th.getMessage(), new Object[0]);
        }
    }

    public static class StateListAnimator implements MessageQueue.IdleHandler {
        public final MessageQueue.IdleHandler OLrzqt;

        public StateListAnimator(MessageQueue.IdleHandler idleHandler) {
            this.OLrzqt = idleHandler;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IdleHandlerLagTracer.KWHzl.postDelayed(IdleHandlerLagTracer.copydefault, IdleHandlerLagTracer.AEQbTJ.isConnected);
            boolean zQueueIdle = this.OLrzqt.queueIdle();
            IdleHandlerLagTracer.KWHzl.removeCallbacks(IdleHandlerLagTracer.copydefault);
            return zQueueIdle;
        }
    }

    public static class MyArrayList<T> extends ArrayList {
        Map<MessageQueue.IdleHandler, StateListAnimator> map = new HashMap();

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            if (obj instanceof MessageQueue.IdleHandler) {
                MessageQueue.IdleHandler idleHandler = (MessageQueue.IdleHandler) obj;
                StateListAnimator stateListAnimator = new StateListAnimator(idleHandler);
                this.map.put(idleHandler, stateListAnimator);
                return super.add(stateListAnimator);
            }
            return super.add(obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(@Nullable Object obj) {
            if (obj instanceof StateListAnimator) {
                this.map.remove(((StateListAnimator) obj).OLrzqt);
                return super.remove(obj);
            }
            StateListAnimator stateListAnimatorRemove = this.map.remove(obj);
            if (stateListAnimatorRemove != null) {
                return super.remove(stateListAnimatorRemove);
            }
            return super.remove(obj);
        }
    }
}
