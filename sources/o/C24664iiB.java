package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.collection.ArrayMapKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iiB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24664iiB extends AbstractC24712iix {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24664iiB(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    public boolean valueOf() {
        return !C23317hvu.copydefault() && copydefault().aUsmxb();
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zValueOf = valueOf();
        if (zValueOf) {
            copydefault(function0, fragmentManager);
        }
        return zValueOf;
    }

    public final void copydefault(@NotNull final Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.String chainName;
        java.lang.String chainName2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault().dvKsVJ().setValue(java.lang.Boolean.FALSE);
        if (copydefault().zuWLRA()) {
            function0.invoke();
            return;
        }
        android.app.Activity activityOLrzqt = OLrzqt();
        if (activityOLrzqt != null) {
            if (fragmentManager != null) {
                InterfaceC22824hme interfaceC22824hmeOLrzqt = C22380heK.OLrzqt.copydefault(copydefault().ffGIBT()).OLrzqt(copydefault().UlJrfe());
                DexMultiTokenInfoBean value = interfaceC22824hmeOLrzqt.KWHzl().getValue();
                if (value == null || (chainName = value.getChainName()) == null) {
                    chainName = "";
                }
                DexMultiTokenInfoBean value2 = interfaceC22824hmeOLrzqt.EZpvd().getValue();
                if (value2 != null && (chainName2 = value2.getChainName()) != null) {
                    str = chainName2;
                }
                java.lang.String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onSeekTo, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("fromChain", chainName), C56390yDp.OLrzqt("toChain", str)));
                copydefault().gEmmrt(copydefault().zuWLRA());
                C24679iiQ c24679iiQKWHzl = C24679iiQ.Companion.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.onRewind), strKWHzl, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? java.lang.Boolean.FALSE : null, C33070mpX.AYXKKw(C23274hvD.Fragment.DwQSDd), C33070mpX.AYXKKw(C23274hvD.Fragment.onPrepareFromUri), (12 & 64) != 0 ? "" : C33070mpX.AYXKKw(C23274hvD.Fragment.onSkipToNext), new Function0() { // from class: o.iiC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C24664iiB.KWHzl(this.copydefault, function0);
                    }
                }, new Function0() { // from class: o.iiE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C24664iiB.OLrzqt(this.AEQbTJ);
                    }
                }, (12 & 512) != 0 ? null : new CompoundButton.OnCheckedChangeListener() { // from class: o.iiD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        C24664iiB.OLrzqt(this.copydefault, compoundButton, z);
                    }
                });
                c24679iiQKWHzl.setCancelable(true);
                c24679iiQKWHzl.show(fragmentManager);
                return;
            }
            final C25253itI c25253itI = new C25253itI(activityOLrzqt);
            c25253itI.EZpvd(copydefault().ffGIBT(), copydefault().UlJrfe());
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityOLrzqt);
            viewOnClickListenerC54939xaY.EZpvd(c25253itI);
            viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.onPrepareFromUri, new View.OnClickListener() { // from class: o.iiF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24664iiB.EZpvd(viewOnClickListenerC54939xaY, this, view);
                }
            });
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.onRemoveQueueItemAt, new View.OnClickListener() { // from class: o.iiG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24664iiB.copydefault(c25253itI, viewOnClickListenerC54939xaY, function0, this, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final Unit KWHzl(C24664iiB c24664iiB, Function0 function0) {
        c24664iiB.copydefault().AkhnZx(c24664iiB.copydefault().DXXBbs());
        function0.invoke();
        c24664iiB.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24664iiB c24664iiB) {
        c24664iiB.AhwBna();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C24664iiB c24664iiB, android.widget.CompoundButton compoundButton, boolean z) {
        c24664iiB.copydefault().gEmmrt(z);
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C24664iiB c24664iiB, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        c24664iiB.AhwBna();
    }

    public static final void copydefault(C25253itI c25253itI, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, C24664iiB c24664iiB, android.view.View view) {
        if (c25253itI.EZpvd()) {
            C23317hvu.AYXKKw(true);
        }
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
        c24664iiB.AYXKKw();
    }

    public final void AYXKKw() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CONFIRM.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.CROSS_CHAIN.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }

    public final void AhwBna() {
        C22877hne.OLrzqt.EZpvd(copydefault().ffGIBT(), DexSwapPopConfirmClick.ButtonName.CANCEL.getValue(), (56 & 4) != 0 ? "" : DexSwapPopConfirmClick.PopupType.CROSS_CHAIN.getValue(), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null);
    }
}
