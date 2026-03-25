package o;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.business.dex.trade.copytrading.edit.ui.navigator.CopyTradingEditStrategyNavigator$navigate$1;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.gSN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gTI {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final kUK AEQbTJ;
    public final gWI EZpvd;

    @yCM
    public gTI(@NotNull gWI gwi, @NotNull kUK kuk) {
        Intrinsics.checkNotNullParameter(gwi, "");
        Intrinsics.checkNotNullParameter(kuk, "");
        this.EZpvd = gwi;
        this.AEQbTJ = kuk;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gTI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static /* synthetic */ void navigate$default(gTI gti, CoroutineScope coroutineScope, ActivityResultLauncher activityResultLauncher, gSN.Application application, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        gti.copydefault(coroutineScope, activityResultLauncher, application, num);
    }

    public final void copydefault(CoroutineScope coroutineScope, ActivityResultLauncher<gSN.Application> activityResultLauncher, gSN.Application application, java.lang.Integer num) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CopyTradingEditStrategyNavigator$navigate$1(num, this, application, activityResultLauncher, null), 3, null);
    }

    public final void EZpvd(@NotNull CoroutineScope coroutineScope, @NotNull ActivityResultLauncher<gSN.Application> activityResultLauncher, java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull DexTrackEventParameter.EditStrategyFrom editStrategyFrom, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        Intrinsics.checkNotNullParameter(editStrategyFrom, "");
        copydefault(coroutineScope, activityResultLauncher, new gSN.Application(str2, str3, false, str, editStrategyFrom), num);
    }

    public final void KWHzl(@NotNull CoroutineScope coroutineScope, @NotNull ActivityResultLauncher<gSN.Application> activityResultLauncher, java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull DexTrackEventParameter.EditStrategyFrom editStrategyFrom) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        Intrinsics.checkNotNullParameter(editStrategyFrom, "");
        pUU.EZpvd("CopyTradingEditStrategyNavigator", "Navigating to edit strategy: " + str2);
        navigate$default(this, coroutineScope, activityResultLauncher, new gSN.Application(str2, str3, true, str, editStrategyFrom), null, 8, null);
    }
}
