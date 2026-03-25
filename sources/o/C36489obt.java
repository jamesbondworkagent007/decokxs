package o;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.inputpanelV2.pluginV2.RedPacketPlugin$onClick$2;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.obt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36489obt extends AbstractC35291nsZ {
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

    @Override // o.InterfaceC35288nsW
    public android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C35399nuc.ActionBar.OcIXYQ);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // o.InterfaceC35288nsW
    public java.lang.String KWHzl() {
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getApplicationContext().getString(C35399nuc.LoaderManager.DFbvW);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC35288nsW
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Btm_Send_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.obu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36489obt.copydefault((EventParamsList) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RedPacketPlugin$onClick$2(this, fragment, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "gift", false, 4, null);
        return Unit.INSTANCE;
    }
}
