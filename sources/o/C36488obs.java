package o;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.inputpanelV2.pluginV2.TransferPlugin$onClick$2;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.obs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36488obs extends AbstractC35291nsZ {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35288nsW
    public void OLrzqt(int i, int i2, android.content.Intent intent, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35288nsW
    public void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
    }

    /* JADX INFO: renamed from: o.obs$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.obs.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC35288nsW
    public android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C35399nuc.ActionBar.AwvSrB);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // o.InterfaceC35288nsW
    public java.lang.String KWHzl() {
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getApplicationContext().getString(C35399nuc.LoaderManager.DztXDE);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC35288nsW
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Btm_Send_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.obq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36488obs.AEQbTJ((EventParamsList) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TransferPlugin$onClick$2(this, fragment, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, ExtJson.BRC20TYPE_TRANSFER, false, 4, null);
        return Unit.INSTANCE;
    }
}
