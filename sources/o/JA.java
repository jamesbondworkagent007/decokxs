package o;

import com.amplitude.android.migration.RemnantDataMigration$execute$1;
import com.amplitude.android.migration.RemnantDataMigration$moveEvent$1;
import com.amplitude.android.migration.RemnantDataMigration$moveEvents$1;
import com.amplitude.android.migration.RemnantDataMigration$moveEvents$2;
import com.amplitude.android.migration.RemnantDataMigration$moveIdentifies$1;
import com.amplitude.android.migration.RemnantDataMigration$moveIdentifies$2;
import com.amplitude.android.migration.RemnantDataMigration$moveInterceptedIdentifies$1;
import com.amplitude.android.migration.RemnantDataMigration$moveInterceptedIdentifies$2;
import com.amplitude.android.migration.RemnantDataMigration$moveSessionData$1;
import com.amplitude.core.Storage;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JA {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final C5233Jv AEQbTJ;
    public final JZ copydefault;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public JA(@NotNull JZ jz, @NotNull C5233Jv c5233Jv) {
        Intrinsics.checkNotNullParameter(jz, "");
        Intrinsics.checkNotNullParameter(c5233Jv, "");
        this.copydefault = jz;
        this.AEQbTJ = c5233Jv;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        RemnantDataMigration$execute$1 remnantDataMigration$execute$1;
        JA ja;
        int i;
        JA ja2;
        JA ja3;
        Storage storageFIwbmz;
        Storage storageFetchVPNInfo;
        if (continuation instanceof RemnantDataMigration$execute$1) {
            remnantDataMigration$execute$1 = (RemnantDataMigration$execute$1) continuation;
            int i2 = remnantDataMigration$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$execute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$execute$1 = new RemnantDataMigration$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = remnantDataMigration$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (remnantDataMigration$execute$1.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                java.lang.String strCopydefault = this.copydefault.fIwbmz().copydefault(Storage.Constants.LAST_EVENT_TIME);
                int i3 = (strCopydefault != null ? StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault) : null) == null ? 1 : 0;
                copydefault();
                remnantDataMigration$execute$1.L$0 = this;
                remnantDataMigration$execute$1.I$0 = i3;
                remnantDataMigration$execute$1.label = 1;
                if (OLrzqt(remnantDataMigration$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                ja = this;
                i = i3;
                if (i != 0) {
                    remnantDataMigration$execute$1.L$0 = ja;
                    remnantDataMigration$execute$1.label = 2;
                    if (ja.AEQbTJ(remnantDataMigration$execute$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    ja2 = ja;
                    remnantDataMigration$execute$1.L$0 = ja2;
                    remnantDataMigration$execute$1.label = 3;
                    if (ja2.copydefault(remnantDataMigration$execute$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    ja = ja2;
                }
                remnantDataMigration$execute$1.L$0 = ja;
                remnantDataMigration$execute$1.label = 4;
                if (ja.EZpvd(remnantDataMigration$execute$1) != objCopydefault) {
                    return objCopydefault;
                }
                ja3 = ja;
                storageFIwbmz = ja3.copydefault.fIwbmz();
                remnantDataMigration$execute$1.L$0 = ja3;
                remnantDataMigration$execute$1.label = 5;
                if (storageFIwbmz.KWHzl(remnantDataMigration$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                storageFetchVPNInfo = ja3.copydefault.fetchVPNInfo();
                remnantDataMigration$execute$1.L$0 = null;
                remnantDataMigration$execute$1.label = 6;
                if (storageFetchVPNInfo.KWHzl(remnantDataMigration$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                i = remnantDataMigration$execute$1.I$0;
                ja = (JA) remnantDataMigration$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                if (i != 0) {
                }
                remnantDataMigration$execute$1.L$0 = ja;
                remnantDataMigration$execute$1.label = 4;
                if (ja.EZpvd(remnantDataMigration$execute$1) != objCopydefault) {
                }
                break;
            case 2:
                ja2 = (JA) remnantDataMigration$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                remnantDataMigration$execute$1.L$0 = ja2;
                remnantDataMigration$execute$1.label = 3;
                if (ja2.copydefault(remnantDataMigration$execute$1) == objCopydefault) {
                }
                ja = ja2;
                remnantDataMigration$execute$1.L$0 = ja;
                remnantDataMigration$execute$1.label = 4;
                if (ja.EZpvd(remnantDataMigration$execute$1) != objCopydefault) {
                }
                break;
            case 3:
                ja2 = (JA) remnantDataMigration$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                ja = ja2;
                remnantDataMigration$execute$1.L$0 = ja;
                remnantDataMigration$execute$1.label = 4;
                if (ja.EZpvd(remnantDataMigration$execute$1) != objCopydefault) {
                }
                break;
            case 4:
                ja3 = (JA) remnantDataMigration$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                storageFIwbmz = ja3.copydefault.fIwbmz();
                remnantDataMigration$execute$1.L$0 = ja3;
                remnantDataMigration$execute$1.label = 5;
                if (storageFIwbmz.KWHzl(remnantDataMigration$execute$1) == objCopydefault) {
                }
                storageFetchVPNInfo = ja3.copydefault.fetchVPNInfo();
                remnantDataMigration$execute$1.L$0 = null;
                remnantDataMigration$execute$1.label = 6;
                if (storageFetchVPNInfo.KWHzl(remnantDataMigration$execute$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                ja3 = (JA) remnantDataMigration$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                storageFetchVPNInfo = ja3.copydefault.fetchVPNInfo();
                remnantDataMigration$execute$1.L$0 = null;
                remnantDataMigration$execute$1.label = 6;
                if (storageFetchVPNInfo.KWHzl(remnantDataMigration$execute$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void copydefault() {
        try {
            java.lang.String strCopydefault = this.AEQbTJ.copydefault("device_id");
            java.lang.String strCopydefault2 = this.AEQbTJ.copydefault(MTCoreConstants.Register.KEY_USER_ID);
            if (strCopydefault == null && strCopydefault2 == null) {
                return;
            }
            MF mfCopydefault = this.copydefault.isConnected().copydefault();
            if (mfCopydefault.OLrzqt() == null && strCopydefault != null) {
                this.copydefault.isConnected().copydefault(strCopydefault);
            }
            if (mfCopydefault.EZpvd() != null || strCopydefault2 == null) {
                return;
            }
            this.copydefault.isConnected().EZpvd(strCopydefault2);
        } catch (java.lang.Exception e) {
            C5239Kb.Companion.KWHzl().EZpvd("device/user id migration failed: " + e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RemnantDataMigration$moveSessionData$1 remnantDataMigration$moveSessionData$1;
        java.lang.Long fieldNames;
        java.lang.Long fieldNames2;
        java.lang.Long lEZpvd;
        JA ja;
        java.lang.Long l;
        java.lang.Long l2;
        java.lang.Long l3;
        Storage storageFIwbmz;
        Storage.Constants constants;
        java.lang.String string;
        JA ja2;
        Storage storageFIwbmz2;
        Storage.Constants constants2;
        java.lang.String string2;
        JA ja3;
        if (continuation instanceof RemnantDataMigration$moveSessionData$1) {
            remnantDataMigration$moveSessionData$1 = (RemnantDataMigration$moveSessionData$1) continuation;
            int i = remnantDataMigration$moveSessionData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveSessionData$1.label = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveSessionData$1 = new RemnantDataMigration$moveSessionData$1(this, continuation);
            }
        }
        java.lang.Object obj = remnantDataMigration$moveSessionData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remnantDataMigration$moveSessionData$1.label;
        try {
        } catch (java.lang.Exception e) {
            C5239Kb.Companion.KWHzl().EZpvd("session data migration failed: " + e.getMessage());
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Storage storageFIwbmz3 = this.copydefault.fIwbmz();
            Storage.Constants constants3 = Storage.Constants.PREVIOUS_SESSION_ID;
            java.lang.String strCopydefault = storageFIwbmz3.copydefault(constants3);
            java.lang.Long fieldNames3 = strCopydefault != null ? StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault) : null;
            java.lang.String strCopydefault2 = this.copydefault.fIwbmz().copydefault(Storage.Constants.LAST_EVENT_TIME);
            fieldNames = strCopydefault2 != null ? StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault2) : null;
            java.lang.String strCopydefault3 = this.copydefault.fIwbmz().copydefault(Storage.Constants.LAST_EVENT_ID);
            fieldNames2 = strCopydefault3 != null ? StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault3) : null;
            java.lang.Long lEZpvd2 = this.AEQbTJ.EZpvd("previous_session_id");
            lEZpvd = this.AEQbTJ.EZpvd("last_event_time");
            java.lang.Long lEZpvd3 = this.AEQbTJ.EZpvd("last_event_id");
            if (fieldNames3 == null && lEZpvd2 != null) {
                Storage storageFIwbmz4 = this.copydefault.fIwbmz();
                java.lang.String string3 = lEZpvd2.toString();
                remnantDataMigration$moveSessionData$1.L$0 = this;
                remnantDataMigration$moveSessionData$1.L$1 = fieldNames;
                remnantDataMigration$moveSessionData$1.L$2 = fieldNames2;
                remnantDataMigration$moveSessionData$1.L$3 = lEZpvd;
                remnantDataMigration$moveSessionData$1.L$4 = lEZpvd3;
                remnantDataMigration$moveSessionData$1.label = 1;
                if (storageFIwbmz4.EZpvd(constants3, string3, remnantDataMigration$moveSessionData$1) == objCopydefault) {
                    return objCopydefault;
                }
                ja = this;
                l = lEZpvd3;
                l2 = lEZpvd;
            } else {
                ja = this;
                l = lEZpvd3;
                l3 = fieldNames2;
                if (fieldNames == null && lEZpvd != null) {
                    storageFIwbmz = ja.copydefault.fIwbmz();
                    constants = Storage.Constants.LAST_EVENT_TIME;
                    string = lEZpvd.toString();
                    remnantDataMigration$moveSessionData$1.L$0 = ja;
                    remnantDataMigration$moveSessionData$1.L$1 = l3;
                    remnantDataMigration$moveSessionData$1.L$2 = l;
                    remnantDataMigration$moveSessionData$1.L$3 = null;
                    remnantDataMigration$moveSessionData$1.L$4 = null;
                    remnantDataMigration$moveSessionData$1.label = 2;
                    if (storageFIwbmz.EZpvd(constants, string, remnantDataMigration$moveSessionData$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    ja2 = ja;
                    ja2.AEQbTJ.AEQbTJ("last_event_time");
                    ja = ja2;
                }
                if (l3 == null) {
                    storageFIwbmz2 = ja.copydefault.fIwbmz();
                    constants2 = Storage.Constants.LAST_EVENT_ID;
                    string2 = l.toString();
                    remnantDataMigration$moveSessionData$1.L$0 = ja;
                    remnantDataMigration$moveSessionData$1.L$1 = null;
                    remnantDataMigration$moveSessionData$1.L$2 = null;
                    remnantDataMigration$moveSessionData$1.L$3 = null;
                    remnantDataMigration$moveSessionData$1.L$4 = null;
                    remnantDataMigration$moveSessionData$1.label = 3;
                    if (storageFIwbmz2.EZpvd(constants2, string2, remnantDataMigration$moveSessionData$1) != objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ja3 = (JA) remnantDataMigration$moveSessionData$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    ja3.AEQbTJ.AEQbTJ("last_event_id");
                    return Unit.INSTANCE;
                }
                l = (java.lang.Long) remnantDataMigration$moveSessionData$1.L$2;
                l3 = (java.lang.Long) remnantDataMigration$moveSessionData$1.L$1;
                ja2 = (JA) remnantDataMigration$moveSessionData$1.L$0;
                C56391yDq.AEQbTJ(obj);
                ja2.AEQbTJ.AEQbTJ("last_event_time");
                ja = ja2;
                if (l3 == null && l != null) {
                    storageFIwbmz2 = ja.copydefault.fIwbmz();
                    constants2 = Storage.Constants.LAST_EVENT_ID;
                    string2 = l.toString();
                    remnantDataMigration$moveSessionData$1.L$0 = ja;
                    remnantDataMigration$moveSessionData$1.L$1 = null;
                    remnantDataMigration$moveSessionData$1.L$2 = null;
                    remnantDataMigration$moveSessionData$1.L$3 = null;
                    remnantDataMigration$moveSessionData$1.L$4 = null;
                    remnantDataMigration$moveSessionData$1.label = 3;
                    if (storageFIwbmz2.EZpvd(constants2, string2, remnantDataMigration$moveSessionData$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    ja3 = ja;
                    ja3.AEQbTJ.AEQbTJ("last_event_id");
                }
                return Unit.INSTANCE;
            }
            l = (java.lang.Long) remnantDataMigration$moveSessionData$1.L$4;
            l2 = (java.lang.Long) remnantDataMigration$moveSessionData$1.L$3;
            fieldNames2 = (java.lang.Long) remnantDataMigration$moveSessionData$1.L$2;
            fieldNames = (java.lang.Long) remnantDataMigration$moveSessionData$1.L$1;
            ja = (JA) remnantDataMigration$moveSessionData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        ja.AEQbTJ.AEQbTJ("previous_session_id");
        lEZpvd = l2;
        l3 = fieldNames2;
        if (fieldNames == null) {
            storageFIwbmz = ja.copydefault.fIwbmz();
            constants = Storage.Constants.LAST_EVENT_TIME;
            string = lEZpvd.toString();
            remnantDataMigration$moveSessionData$1.L$0 = ja;
            remnantDataMigration$moveSessionData$1.L$1 = l3;
            remnantDataMigration$moveSessionData$1.L$2 = l;
            remnantDataMigration$moveSessionData$1.L$3 = null;
            remnantDataMigration$moveSessionData$1.L$4 = null;
            remnantDataMigration$moveSessionData$1.label = 2;
            if (storageFIwbmz.EZpvd(constants, string, remnantDataMigration$moveSessionData$1) != objCopydefault) {
            }
        }
        if (l3 == null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RemnantDataMigration$moveEvents$1 remnantDataMigration$moveEvents$1;
        java.util.Iterator<JSONObject> it;
        JA ja;
        if (continuation instanceof RemnantDataMigration$moveEvents$1) {
            remnantDataMigration$moveEvents$1 = (RemnantDataMigration$moveEvents$1) continuation;
            int i = remnantDataMigration$moveEvents$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveEvents$1.label = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveEvents$1 = new RemnantDataMigration$moveEvents$1(this, continuation);
            }
        }
        java.lang.Object obj = remnantDataMigration$moveEvents$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remnantDataMigration$moveEvents$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                it = this.AEQbTJ.OLrzqt().iterator();
                ja = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) remnantDataMigration$moveEvents$1.L$1;
                ja = (JA) remnantDataMigration$moveEvents$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            while (it.hasNext()) {
                JSONObject next = it.next();
                Storage storageFIwbmz = ja.copydefault.fIwbmz();
                RemnantDataMigration$moveEvents$2 remnantDataMigration$moveEvents$2 = new RemnantDataMigration$moveEvents$2(ja.AEQbTJ);
                remnantDataMigration$moveEvents$1.L$0 = ja;
                remnantDataMigration$moveEvents$1.L$1 = it;
                remnantDataMigration$moveEvents$1.label = 1;
                if (ja.OLrzqt(next, storageFIwbmz, remnantDataMigration$moveEvents$2, remnantDataMigration$moveEvents$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } catch (java.lang.Exception e) {
            C5239Kb.Companion.KWHzl().EZpvd("events migration failed: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RemnantDataMigration$moveIdentifies$1 remnantDataMigration$moveIdentifies$1;
        java.util.Iterator<JSONObject> it;
        JA ja;
        if (continuation instanceof RemnantDataMigration$moveIdentifies$1) {
            remnantDataMigration$moveIdentifies$1 = (RemnantDataMigration$moveIdentifies$1) continuation;
            int i = remnantDataMigration$moveIdentifies$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveIdentifies$1.label = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveIdentifies$1 = new RemnantDataMigration$moveIdentifies$1(this, continuation);
            }
        }
        java.lang.Object obj = remnantDataMigration$moveIdentifies$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remnantDataMigration$moveIdentifies$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                it = this.AEQbTJ.KWHzl().iterator();
                ja = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) remnantDataMigration$moveIdentifies$1.L$1;
                ja = (JA) remnantDataMigration$moveIdentifies$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            while (it.hasNext()) {
                JSONObject next = it.next();
                Storage storageFIwbmz = ja.copydefault.fIwbmz();
                RemnantDataMigration$moveIdentifies$2 remnantDataMigration$moveIdentifies$2 = new RemnantDataMigration$moveIdentifies$2(ja.AEQbTJ);
                remnantDataMigration$moveIdentifies$1.L$0 = ja;
                remnantDataMigration$moveIdentifies$1.L$1 = it;
                remnantDataMigration$moveIdentifies$1.label = 1;
                if (ja.OLrzqt(next, storageFIwbmz, remnantDataMigration$moveIdentifies$2, remnantDataMigration$moveIdentifies$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } catch (java.lang.Exception e) {
            C5239Kb.Companion.KWHzl().EZpvd("identifies migration failed: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RemnantDataMigration$moveInterceptedIdentifies$1 remnantDataMigration$moveInterceptedIdentifies$1;
        java.util.Iterator<JSONObject> it;
        JA ja;
        if (continuation instanceof RemnantDataMigration$moveInterceptedIdentifies$1) {
            remnantDataMigration$moveInterceptedIdentifies$1 = (RemnantDataMigration$moveInterceptedIdentifies$1) continuation;
            int i = remnantDataMigration$moveInterceptedIdentifies$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveInterceptedIdentifies$1.label = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveInterceptedIdentifies$1 = new RemnantDataMigration$moveInterceptedIdentifies$1(this, continuation);
            }
        }
        java.lang.Object obj = remnantDataMigration$moveInterceptedIdentifies$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remnantDataMigration$moveInterceptedIdentifies$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                it = this.AEQbTJ.AEQbTJ().iterator();
                ja = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) remnantDataMigration$moveInterceptedIdentifies$1.L$1;
                ja = (JA) remnantDataMigration$moveInterceptedIdentifies$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            while (it.hasNext()) {
                JSONObject next = it.next();
                Storage storageFetchVPNInfo = ja.copydefault.fetchVPNInfo();
                RemnantDataMigration$moveInterceptedIdentifies$2 remnantDataMigration$moveInterceptedIdentifies$2 = new RemnantDataMigration$moveInterceptedIdentifies$2(ja.AEQbTJ);
                remnantDataMigration$moveInterceptedIdentifies$1.L$0 = ja;
                remnantDataMigration$moveInterceptedIdentifies$1.L$1 = it;
                remnantDataMigration$moveInterceptedIdentifies$1.label = 1;
                if (ja.OLrzqt(next, storageFetchVPNInfo, remnantDataMigration$moveInterceptedIdentifies$2, remnantDataMigration$moveInterceptedIdentifies$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } catch (java.lang.Exception e) {
            C5239Kb.Companion.KWHzl().EZpvd("intercepted identifies migration failed: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(JSONObject jSONObject, Storage storage, Function1<? super java.lang.Long, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RemnantDataMigration$moveEvent$1 remnantDataMigration$moveEvent$1;
        long j;
        if (continuation instanceof RemnantDataMigration$moveEvent$1) {
            remnantDataMigration$moveEvent$1 = (RemnantDataMigration$moveEvent$1) continuation;
            int i = remnantDataMigration$moveEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveEvent$1 = new RemnantDataMigration$moveEvent$1(this, continuation);
            }
        }
        java.lang.Object obj = remnantDataMigration$moveEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = remnantDataMigration$moveEvent$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                long jKWHzl = KWHzl(jSONObject);
                C5242Ke c5242KeAEQbTJ = KX.AEQbTJ(jSONObject);
                remnantDataMigration$moveEvent$1.L$0 = function1;
                remnantDataMigration$moveEvent$1.J$0 = jKWHzl;
                remnantDataMigration$moveEvent$1.label = 1;
                if (storage.EZpvd(c5242KeAEQbTJ, (Continuation<? super Unit>) remnantDataMigration$moveEvent$1) == objCopydefault) {
                    return objCopydefault;
                }
                j = jKWHzl;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = remnantDataMigration$moveEvent$1.J$0;
                function1 = (Function1) remnantDataMigration$moveEvent$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            function1.invoke(C56443yFo.KWHzl(j));
        } catch (java.lang.Exception e) {
            C5239Kb.Companion.KWHzl().EZpvd("event migration failed: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    public final long KWHzl(JSONObject jSONObject) throws JSONException {
        long j = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("library");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("library", jSONObjectOptJSONObject.getString("name") + JsonPointer.SEPARATOR + jSONObjectOptJSONObject.getString("version"));
        }
        java.lang.Object objOpt = jSONObject.opt("timestamp");
        if (objOpt != null) {
            jSONObject.put(CrashHianalyticsData.TIME, objOpt);
        }
        java.lang.Object objOpt2 = jSONObject.opt("uuid");
        if (objOpt2 != null) {
            jSONObject.put("insert_id", objOpt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (jSONObjectOptJSONObject2 != null) {
            java.lang.Object objOpt3 = jSONObjectOptJSONObject2.opt("androidADID");
            if (objOpt3 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt3, "");
                jSONObject.put("adid", objOpt3);
            }
            java.lang.Object objOpt4 = jSONObjectOptJSONObject2.opt("android_app_set_id");
            if (objOpt4 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt4, "");
                jSONObject.put("android_app_set_id", objOpt4);
            }
            java.lang.Object objOpt5 = jSONObjectOptJSONObject2.opt("productId");
            if (objOpt5 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt5, "");
                jSONObject.put("productId", objOpt5);
            }
            java.lang.Object objOpt6 = jSONObjectOptJSONObject2.opt(FirebaseAnalytics.Param.QUANTITY);
            if (objOpt6 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt6, "");
                jSONObject.put(FirebaseAnalytics.Param.QUANTITY, objOpt6);
            }
            java.lang.Object objOpt7 = jSONObjectOptJSONObject2.opt(FirebaseAnalytics.Param.PRICE);
            if (objOpt7 != null) {
                Intrinsics.checkNotNullExpressionValue(objOpt7, "");
                jSONObject.put(FirebaseAnalytics.Param.PRICE, objOpt7);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("location");
            if (jSONObjectOptJSONObject3 != null) {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject3, "");
                java.lang.Object objOpt8 = jSONObjectOptJSONObject3.opt("lat");
                if (objOpt8 != null) {
                    Intrinsics.checkNotNullExpressionValue(objOpt8, "");
                    jSONObject.put("location_lat", objOpt8);
                }
                java.lang.Object objOpt9 = jSONObjectOptJSONObject3.opt("lng");
                if (objOpt9 != null) {
                    Intrinsics.checkNotNullExpressionValue(objOpt9, "");
                    jSONObject.put("location_lng", objOpt9);
                }
            }
        }
        java.lang.Object objOpt10 = jSONObject.opt("$productId");
        if (objOpt10 != null) {
            jSONObject.put("productId", objOpt10);
        }
        java.lang.Object objOpt11 = jSONObject.opt("$quantity");
        if (objOpt11 != null) {
            jSONObject.put(FirebaseAnalytics.Param.QUANTITY, objOpt11);
        }
        java.lang.Object objOpt12 = jSONObject.opt("$price");
        if (objOpt12 != null) {
            jSONObject.put(FirebaseAnalytics.Param.PRICE, objOpt12);
        }
        java.lang.Object objOpt13 = jSONObject.opt("$revenueType");
        if (objOpt13 != null) {
            jSONObject.put("revenueType", objOpt13);
        }
        return j;
    }
}
