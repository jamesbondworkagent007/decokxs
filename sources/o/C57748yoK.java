package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;

/* JADX INFO: renamed from: o.yoK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57748yoK {
    public final C57876yqg EZpvd;
    public final C57759yoV OLrzqt;
    public java.util.Set<java.lang.String> copydefault;

    public C57748yoK(@androidx.annotation.NonNull C57759yoV c57759yoV, @androidx.annotation.NonNull C57876yqg c57876yqg) {
        this.OLrzqt = c57759yoV;
        this.EZpvd = c57876yqg;
        copydefault();
    }

    public final void copydefault() {
        this.copydefault = OSUtils.AuCTel();
        java.util.Set<java.lang.String> setEZpvd = this.EZpvd.OLrzqt().EZpvd();
        if (setEZpvd != null) {
            this.copydefault = setEZpvd;
        }
    }

    public void OLrzqt() {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "OneSignal cleanOutcomes for session");
        this.copydefault = OSUtils.AuCTel();
        KWHzl();
    }

    public void EZpvd() {
        new java.lang.Thread(new java.lang.Runnable() { // from class: o.yoK.5
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Thread.currentThread().setPriority(10);
                C57748yoK.this.EZpvd.OLrzqt().OLrzqt(RemoteMessageConst.NOTIFICATION, MTPushConstants.Message.KEY_NOTIFICATION_ID);
            }
        }, "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    public void AEQbTJ() {
        new java.lang.Thread(new java.lang.Runnable() { // from class: o.yoK.4
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Thread.currentThread().setPriority(10);
                java.util.Iterator<C57885yqp> it = C57748yoK.this.EZpvd.OLrzqt().copydefault().iterator();
                while (it.hasNext()) {
                    C57748yoK.this.AEQbTJ(it.next());
                }
            }
        }, "OS_SEND_SAVED_OUTCOMES").start();
    }

    public final void AEQbTJ(@androidx.annotation.NonNull final C57885yqp c57885yqp) {
        int iUzCIH = new OSUtils().uzCIH();
        this.EZpvd.OLrzqt().KWHzl(OneSignal.AhwBna, iUzCIH, c57885yqp, new InterfaceC57828ypl() { // from class: o.yoK.2
            @Override // o.InterfaceC57828ypl
            public void copydefault(int i, java.lang.String str, java.lang.Throwable th) {
            }

            @Override // o.InterfaceC57828ypl
            public void AEQbTJ(java.lang.String str) {
                C57748yoK.this.EZpvd.OLrzqt().AEQbTJ(c57885yqp);
            }
        });
    }

    public void EZpvd(java.util.List<C57781yor> list) {
        for (C57781yor c57781yor : list) {
            java.lang.String strAEQbTJ = c57781yor.AEQbTJ();
            if (c57781yor.KWHzl()) {
                OLrzqt(strAEQbTJ, (OneSignal.ClipData) null);
            } else if (c57781yor.EZpvd() > 0.0f) {
                AEQbTJ(strAEQbTJ, c57781yor.EZpvd(), null);
            } else {
                EZpvd(strAEQbTJ, null);
            }
        }
    }

    public void OLrzqt(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable OneSignal.ClipData clipData) {
        KWHzl(str, this.OLrzqt.AEQbTJ(), clipData);
    }

    public void EZpvd(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable OneSignal.ClipData clipData) {
        EZpvd(str, 0.0f, this.OLrzqt.AEQbTJ(), clipData);
    }

    public void AEQbTJ(@androidx.annotation.NonNull java.lang.String str, float f, @androidx.annotation.Nullable OneSignal.ClipData clipData) {
        EZpvd(str, f, this.OLrzqt.AEQbTJ(), clipData);
    }

    public final void KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.util.List<C57870yqa> list, @androidx.annotation.Nullable OneSignal.ClipData clipData) {
        java.util.List<C57870yqa> listKWHzl = KWHzl(list);
        if (listKWHzl.isEmpty()) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        java.util.Iterator<C57870yqa> it = listKWHzl.iterator();
        while (it.hasNext()) {
            if (it.next().EZpvd().isAttributed()) {
                java.util.List<C57870yqa> listCopydefault = copydefault(str, listKWHzl);
                if (listCopydefault == null) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + listKWHzl.toString() + "\nOutcome name: " + str);
                    if (clipData != null) {
                        clipData.EZpvd(null);
                        return;
                    }
                    return;
                }
                EZpvd(str, 0.0f, listCopydefault, clipData);
                return;
            }
        }
        if (this.copydefault.contains(str)) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + OSInfluenceType.UNATTRIBUTED + "\nOutcome name: " + str);
            if (clipData != null) {
                clipData.EZpvd(null);
                return;
            }
            return;
        }
        this.copydefault.add(str);
        EZpvd(str, 0.0f, listKWHzl, clipData);
    }

    public final void EZpvd(@androidx.annotation.NonNull final java.lang.String str, @androidx.annotation.NonNull float f, @androidx.annotation.NonNull java.util.List<C57870yqa> list, @androidx.annotation.Nullable final OneSignal.ClipData clipData) {
        final long jKWHzl = OneSignal.aKErDB().KWHzl() / 1000;
        int iUzCIH = new OSUtils().uzCIH();
        java.lang.String str2 = OneSignal.AhwBna;
        boolean z = false;
        C57890yqu c57890yquCopydefault = null;
        C57890yqu c57890yquCopydefault2 = null;
        for (C57870yqa c57870yqa : list) {
            int i = AnonymousClass10.OLrzqt[c57870yqa.EZpvd().ordinal()];
            if (i == 1) {
                if (c57890yquCopydefault == null) {
                    c57890yquCopydefault = new C57890yqu();
                }
                c57890yquCopydefault = copydefault(c57870yqa, c57890yquCopydefault);
            } else if (i == 2) {
                if (c57890yquCopydefault2 == null) {
                    c57890yquCopydefault2 = new C57890yqu();
                }
                c57890yquCopydefault2 = copydefault(c57870yqa, c57890yquCopydefault2);
            } else if (i == 3) {
                z = true;
            } else if (i == 4) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for channel: " + c57870yqa.AEQbTJ());
                if (clipData != null) {
                    clipData.EZpvd(null);
                    return;
                }
                return;
            }
        }
        if (c57890yquCopydefault == null && c57890yquCopydefault2 == null && !z) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for all channels");
            if (clipData != null) {
                clipData.EZpvd(null);
                return;
            }
            return;
        }
        final C57885yqp c57885yqp = new C57885yqp(str, new C57891yqv(c57890yquCopydefault, c57890yquCopydefault2), f, 0L);
        this.EZpvd.OLrzqt().KWHzl(str2, iUzCIH, c57885yqp, new InterfaceC57828ypl() { // from class: o.yoK.1
            @Override // o.InterfaceC57828ypl
            public void AEQbTJ(java.lang.String str3) {
                C57748yoK.this.OLrzqt(c57885yqp);
                OneSignal.ClipData clipData2 = clipData;
                if (clipData2 != null) {
                    clipData2.EZpvd(C57750yoM.AEQbTJ(c57885yqp));
                }
            }

            @Override // o.InterfaceC57828ypl
            public void copydefault(int i2, java.lang.String str3, java.lang.Throwable th) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: o.yoK.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        java.lang.Thread.currentThread().setPriority(10);
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        c57885yqp.KWHzl(jKWHzl);
                        C57748yoK.this.EZpvd.OLrzqt().KWHzl(c57885yqp);
                    }
                }, "OS_SAVE_OUTCOMES").start();
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.WARN, "Sending outcome with name: " + str + " failed with status code: " + i2 + " and response: " + str3 + "\nOutcome event was cached and will be reattempted on app cold start");
                OneSignal.ClipData clipData2 = clipData;
                if (clipData2 != null) {
                    clipData2.EZpvd(null);
                }
            }
        });
    }

    /* JADX INFO: renamed from: o.yoK$10, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[OSInfluenceChannel.values().length];
            copydefault = iArr;
            try {
                iArr[OSInfluenceChannel.IAM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[OSInfluenceChannel.NOTIFICATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OSInfluenceType.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[OSInfluenceType.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[OSInfluenceType.INDIRECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[OSInfluenceType.UNATTRIBUTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[OSInfluenceType.DISABLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public final C57890yqu copydefault(C57870yqa c57870yqa, C57890yqu c57890yqu) {
        int i = AnonymousClass10.copydefault[c57870yqa.AEQbTJ().ordinal()];
        if (i == 1) {
            c57890yqu.KWHzl(c57870yqa.OLrzqt());
        } else if (i == 2) {
            c57890yqu.AEQbTJ(c57870yqa.OLrzqt());
        }
        return c57890yqu;
    }

    public final java.util.List<C57870yqa> KWHzl(java.util.List<C57870yqa> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (C57870yqa c57870yqa : list) {
            if (c57870yqa.EZpvd().isDisabled()) {
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "Outcomes disabled for channel: " + c57870yqa.AEQbTJ().toString());
                arrayList.remove(c57870yqa);
            }
        }
        return arrayList;
    }

    public final void OLrzqt(C57885yqp c57885yqp) {
        if (c57885yqp.OLrzqt()) {
            KWHzl();
        } else {
            KWHzl(c57885yqp);
        }
    }

    public final void KWHzl(final C57885yqp c57885yqp) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: o.yoK.3
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Thread.currentThread().setPriority(10);
                C57748yoK.this.EZpvd.OLrzqt().copydefault(c57885yqp);
            }
        }, "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    public final void KWHzl() {
        this.EZpvd.OLrzqt().KWHzl(this.copydefault);
    }

    public final java.util.List<C57870yqa> copydefault(java.lang.String str, java.util.List<C57870yqa> list) {
        java.util.List<C57870yqa> listAEQbTJ = this.EZpvd.OLrzqt().AEQbTJ(str, list);
        if (listAEQbTJ.size() > 0) {
            return listAEQbTJ;
        }
        return null;
    }
}
