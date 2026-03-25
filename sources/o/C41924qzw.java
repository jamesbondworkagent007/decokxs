package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.ViewKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.ext.UpDownColor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41924qzw extends AbstractC39964qEh<C41876qzA, C42804rdN> {
    public static final int AEQbTJ = C41421qqW.KWHzl;
    public final C41421qqW copydefault;

    public C41924qzw(@NotNull C41421qqW c41421qqW) {
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        this.copydefault = c41421qqW;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42804rdN AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42804rdN c42804rdNAEQbTJ = C42804rdN.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42804rdNAEQbTJ, "");
        return c42804rdNAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42804rdN c42804rdN, final int i, @NotNull final C41876qzA c41876qzA) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c42804rdN, "");
        Intrinsics.checkNotNullParameter(c41876qzA, "");
        C41424qqZ c41424qqZ = (C41424qqZ) this.copydefault.copydefault((java.lang.Object) c41876qzA);
        java.lang.CharSequence charSequenceCopydefault = c41424qqZ.copydefault();
        UpDownColor upDownColorOLrzqt = c41424qqZ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41424qqZ.KWHzl();
        java.lang.CharSequence charSequenceAEQbTJ = c41424qqZ.AEQbTJ();
        java.lang.CharSequence charSequenceEZpvd = c41424qqZ.EZpvd();
        java.lang.CharSequence charSequenceValueOf = c41424qqZ.valueOf();
        if (charSequenceEZpvd == null) {
            charSequenceEZpvd = "--";
        }
        if (charSequenceAEQbTJ == null) {
            charSequenceAEQbTJ = "--";
        }
        android.content.Context context = c42804rdN.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            java.lang.CharSequence charSequenceUnicodeWrap = androidx.core.text.BidiFormatter.getInstance().unicodeWrap(charSequenceAEQbTJ);
            str = ((java.lang.Object) androidx.core.text.BidiFormatter.getInstance().unicodeWrap(charSequenceEZpvd)) + " • " + ((java.lang.Object) charSequenceUnicodeWrap);
        } else {
            str = ((java.lang.Object) charSequenceAEQbTJ) + " • " + ((java.lang.Object) charSequenceEZpvd);
        }
        java.lang.String str2 = str;
        C42950rgA c42950rgA = c42804rdN.OLrzqt;
        boolean zEZpvd = Intrinsics.EZpvd(c41876qzA.fetchVPNInfo(), java.lang.Boolean.TRUE);
        java.lang.String tokenSymbol = c41876qzA.copydefault().getTokenSymbol();
        if (charSequenceValueOf == null) {
            charSequenceValueOf = "--";
        }
        java.lang.CharSequence charSequence = charSequenceKWHzl == null ? "--" : charSequenceKWHzl;
        if (charSequenceCopydefault == null) {
            charSequenceCopydefault = "--";
        }
        java.lang.String strAEQbTJ = AEQbTJ();
        int iDjBIcL = C33570myu.djBIcL(c42804rdN.OLrzqt.getContext());
        int iDpInt$default = C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null);
        int iDpInt$default2 = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
        int iDpInt$default3 = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        boolean zGEmmrt = C59449zhJ.gEmmrt(c41876qzA.copydefault().getTokenContractAddress(), AEQbTJ(), true);
        java.lang.Boolean boolOLrzqt = c41876qzA.OLrzqt();
        boolean zBooleanValue = boolOLrzqt != null ? boolOLrzqt.booleanValue() : false;
        java.lang.String strEZpvd = c41876qzA.EZpvd();
        C42950rgA.setData$OKMarket_market_impl$default(c42950rgA, zEZpvd, tokenSymbol, charSequenceValueOf, str2, charSequence, charSequenceCopydefault, upDownColorOLrzqt, strAEQbTJ, ((iDjBIcL - iDpInt$default) - iDpInt$default2) - iDpInt$default3, false, zGEmmrt, zBooleanValue, strEZpvd == null ? "" : strEZpvd, new Function1() { // from class: o.qzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41924qzw.EZpvd(c41876qzA, (java.lang.String) obj);
            }
        }, 512, null);
        AppCompatImageView appCompatImageView = c42804rdN.copydefault;
        appCompatImageView.setEnabled(true ^ c41876qzA.DbNXlk());
        appCompatImageView.setSelected(c41876qzA.AEQbTJ());
        c42804rdN.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.qzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41924qzw.copydefault(c41876qzA, c42804rdN, i, view);
            }
        });
    }

    public static final Unit EZpvd(final C41876qzA c41876qzA, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            C32866mlf.onEvent$default("Cedefi_Tag_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.qzB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41924qzw.AEQbTJ(c41876qzA, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C41876qzA c41876qzA, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", c41876qzA.copydefault().getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", c41876qzA.copydefault().getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", c41876qzA.copydefault().getChainName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", NotificationCompat.CATEGORY_NAVIGATION, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C41876qzA c41876qzA, C42804rdN c42804rdN, int i, android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        if (c41876qzA.DbNXlk()) {
            return;
        }
        c42804rdN.copydefault.setSelected(!r5.isSelected());
        ConstraintLayout root = c42804rdN.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment != null) {
            boolean z = fragment instanceof InterfaceC41923qzv;
            java.lang.Object obj = fragment;
            if (!z) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof InterfaceC41923qzv)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                obj = (InterfaceC41923qzv) (parentFragment instanceof InterfaceC41923qzv ? parentFragment : null);
            }
            InterfaceC41923qzv interfaceC41923qzv = (InterfaceC41923qzv) obj;
            if (interfaceC41923qzv != null) {
                interfaceC41923qzv.KWHzl(i, c41876qzA.copydefault(), c42804rdN.copydefault.isSelected());
            }
        }
        c41876qzA.OLrzqt(c42804rdN.copydefault.isSelected());
    }
}
