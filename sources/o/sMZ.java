package o;

import com.okinc.okimcore.feature.notification.preference.NotifyPreferencesSettingUseCaseImpl$clear$1;
import com.okinc.okimcore.feature.notification.preference.NotifyPreferencesSettingUseCaseImpl$saveStatus$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMZ implements InterfaceC44365sNc {
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final android.content.Context OLrzqt;
    public final java.lang.String copydefault;
    public final CoroutineDispatcher gEmmrt;

    @yCM
    public sMZ(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = context;
        this.gEmmrt = coroutineDispatcher;
        this.EZpvd = "im_notify_setting";
        this.KWHzl = "_key_receive_app_push";
        this.AEQbTJ = "_key_show_summary_in_push";
        this.copydefault = "_key_mute_notification";
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sNf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sMZ.copydefault(this.EZpvd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.content.SharedPreferences OLrzqt() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.content.SharedPreferences) value;
    }

    public static final android.content.SharedPreferences copydefault(sMZ smz) {
        return smz.OLrzqt.getSharedPreferences(smz.EZpvd, 0);
    }

    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = OLrzqt(this.KWHzl, z, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    @Override // o.InterfaceC44365sNc
    public boolean EZpvd() {
        return AEQbTJ(this.KWHzl, true);
    }

    public java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = OLrzqt(this.AEQbTJ, z, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public java.lang.Object copydefault(boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = OLrzqt(this.copydefault, z, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    @Override // o.InterfaceC44365sNc
    public boolean copydefault() {
        return AEQbTJ(this.copydefault, false);
    }

    public final java.lang.Object OLrzqt(java.lang.String str, boolean z, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.gEmmrt, new NotifyPreferencesSettingUseCaseImpl$saveStatus$2(this, str, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final boolean AEQbTJ(java.lang.String str, boolean z) {
        if (!C44157sFk.gEmmrt().values()) {
            return false;
        }
        java.lang.String strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
        return OLrzqt().getBoolean(strCopydefault + str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44365sNc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NotifyPreferencesSettingUseCaseImpl$clear$1 notifyPreferencesSettingUseCaseImpl$clear$1;
        sMZ smz;
        if (continuation instanceof NotifyPreferencesSettingUseCaseImpl$clear$1) {
            notifyPreferencesSettingUseCaseImpl$clear$1 = (NotifyPreferencesSettingUseCaseImpl$clear$1) continuation;
            int i = notifyPreferencesSettingUseCaseImpl$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notifyPreferencesSettingUseCaseImpl$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                notifyPreferencesSettingUseCaseImpl$clear$1 = new NotifyPreferencesSettingUseCaseImpl$clear$1(this, continuation);
            }
        }
        java.lang.Object obj = notifyPreferencesSettingUseCaseImpl$clear$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = notifyPreferencesSettingUseCaseImpl$clear$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            notifyPreferencesSettingUseCaseImpl$clear$1.L$0 = this;
            notifyPreferencesSettingUseCaseImpl$clear$1.label = 1;
            if (KWHzl(true, notifyPreferencesSettingUseCaseImpl$clear$1) == objCopydefault) {
                return objCopydefault;
            }
            smz = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                smz = (sMZ) notifyPreferencesSettingUseCaseImpl$clear$1.L$0;
                C56391yDq.AEQbTJ(obj);
                notifyPreferencesSettingUseCaseImpl$clear$1.L$0 = null;
                notifyPreferencesSettingUseCaseImpl$clear$1.label = 3;
                if (smz.copydefault(false, notifyPreferencesSettingUseCaseImpl$clear$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            smz = (sMZ) notifyPreferencesSettingUseCaseImpl$clear$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        notifyPreferencesSettingUseCaseImpl$clear$1.L$0 = smz;
        notifyPreferencesSettingUseCaseImpl$clear$1.label = 2;
        if (smz.OLrzqt(true, notifyPreferencesSettingUseCaseImpl$clear$1) == objCopydefault) {
            return objCopydefault;
        }
        notifyPreferencesSettingUseCaseImpl$clear$1.L$0 = null;
        notifyPreferencesSettingUseCaseImpl$clear$1.label = 3;
        if (smz.copydefault(false, notifyPreferencesSettingUseCaseImpl$clear$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
