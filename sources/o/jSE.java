package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.material.snackbar.Snackbar;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jSE {
    public static final jSE EZpvd = new jSE();

    private jSE() {
    }

    public static /* synthetic */ boolean showSnackBarInner$default(jSE jse, android.content.Context context, int i, Function2 function2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = WalletImportError.ERROR_CODE_AA_CREATE_KEY;
        }
        return jse.OLrzqt(context, i, function2);
    }

    public final <T extends ViewBinding> boolean OLrzqt(android.content.Context context, int i, Function2<? super Snackbar, ? super android.view.LayoutInflater, ? extends T> function2) {
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(context);
        android.app.Activity activity = contextOLrzqt instanceof android.app.Activity ? (android.app.Activity) contextOLrzqt : null;
        if (activity == null) {
            return false;
        }
        Snackbar snackbarMake = Snackbar.make(activity.findViewById(android.R.id.content), "", 0);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "");
        android.view.LayoutInflater layoutInflater = activity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        android.view.View root = function2.invoke(snackbarMake, layoutInflater).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        snackbarMake.getView().setBackgroundColor(0);
        android.view.View view = snackbarMake.getView();
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return false;
        }
        viewGroup.setPadding(0, 0, 0, 0);
        viewGroup.addView(root, 0);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return false;
        }
        marginLayoutParams.bottomMargin = (int) C55298xhM.AEQbTJ(i, context);
        viewGroup.setLayoutParams(marginLayoutParams);
        snackbarMake.show();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jSE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showTip$default(jSE jse, android.content.Context context, int i, java.util.Map map, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            map = null;
        }
        if ((i3 & 8) != 0) {
            i2 = WalletImportError.ERROR_CODE_AA_CREATE_KEY;
        }
        jse.copydefault(context, i, map, i2);
    }

    public final void copydefault(@NotNull final android.content.Context context, @androidx.annotation.StringRes final int i, final java.util.Map<java.lang.String, java.lang.String> map, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(OLrzqt(context, i2, new Function2() { // from class: o.jSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jSE.EZpvd(map, context, i, (Snackbar) obj, (android.view.LayoutInflater) obj2);
            }
        }));
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            C55326xho.toast$default(context.getString(i), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final C42902rfF EZpvd(java.util.Map map, android.content.Context context, int i, final Snackbar snackbar, android.view.LayoutInflater layoutInflater) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(snackbar, "");
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C42902rfF c42902rfFAEQbTJ = C42902rfF.AEQbTJ(layoutInflater);
        AppCompatTextView appCompatTextView = c42902rfFAEQbTJ.copydefault;
        if (map == null || (string = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map)) == null) {
            string = context.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        appCompatTextView.setText(string);
        c42902rfFAEQbTJ.EZpvd.setText((java.lang.CharSequence) null);
        c42902rfFAEQbTJ.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.zEHIKV, 0);
        c42902rfFAEQbTJ.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jSD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jSE.copydefault(snackbar, view);
            }
        });
        return c42902rfFAEQbTJ;
    }

    public static final void copydefault(Snackbar snackbar, android.view.View view) {
        snackbar.dismiss();
    }

    public static /* synthetic */ void showTipWithAction$default(jSE jse, android.content.Context context, int i, int i2, int i3, Function0 function0, int i4, java.lang.Object obj) {
        if ((i4 & 8) != 0) {
            i3 = WalletImportError.ERROR_CODE_AA_CREATE_KEY;
        }
        jse.copydefault(context, i, i2, i3, function0);
    }

    public final void copydefault(android.content.Context context, @androidx.annotation.StringRes final int i, @androidx.annotation.StringRes final int i2, int i3, final Function0<Unit> function0) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(OLrzqt(context, i3, new Function2() { // from class: o.jSC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jSE.EZpvd(i, i2, function0, (Snackbar) obj, (android.view.LayoutInflater) obj2);
            }
        }));
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            C55326xho.toast$default(context.getString(i), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final C42902rfF EZpvd(int i, int i2, final Function0 function0, final Snackbar snackbar, android.view.LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(snackbar, "");
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C42902rfF c42902rfFAEQbTJ = C42902rfF.AEQbTJ(layoutInflater);
        c42902rfFAEQbTJ.copydefault.setText(i);
        c42902rfFAEQbTJ.EZpvd.setText(i2);
        c42902rfFAEQbTJ.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.DGUQLI, 0);
        c42902rfFAEQbTJ.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jSE.KWHzl(snackbar, function0, view);
            }
        });
        return c42902rfFAEQbTJ;
    }

    public static final void KWHzl(Snackbar snackbar, Function0 function0, android.view.View view) {
        snackbar.dismiss();
        function0.invoke();
    }

    public static /* synthetic */ void showCryptoAddedTip$default(jSE jse, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC55797xqi interfaceC55797xqi, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            i = WalletImportError.ERROR_CODE_AA_CREATE_KEY;
        }
        jse.AEQbTJ(context, fragmentManager, interfaceC55797xqi, str, i);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final InterfaceC55797xqi interfaceC55797xqi, @NotNull final java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC55797xqi, "");
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(context, qZH.PendingIntent.OijiEz, qZH.PendingIntent.UfveVb, i, new Function0() { // from class: o.jSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jSE.OLrzqt(interfaceC55797xqi, fragmentManager, str);
            }
        });
    }

    public static final Unit OLrzqt(InterfaceC55797xqi interfaceC55797xqi, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        MarketFavoritesGroupPo.FavoritesPo favoritesPo;
        if (interfaceC55797xqi instanceof BizInstrument) {
            WatchListData watchListDataOLrzqt = qWJ.OLrzqt((BizInstrument) interfaceC55797xqi);
            favoritesPo = new MarketFavoritesGroupPo.FavoritesPo(watchListDataOLrzqt.getInstId(), watchListDataOLrzqt.getInstType(), watchListDataOLrzqt.getAlias(), watchListDataOLrzqt.getExpTime(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        } else {
            if (!(interfaceC55797xqi instanceof DexInstrument)) {
                throw new NoWhenBranchMatchedException();
            }
            DexInstrument dexInstrument = (DexInstrument) interfaceC55797xqi;
            favoritesPo = new MarketFavoritesGroupPo.FavoritesPo(null, "CEDEFI", null, null, null, dexInstrument.getChainId(), dexInstrument.getTokenContractAddress(), dexInstrument.getTokenSymbol(), 29, null);
        }
        jTS.Companion.copydefault(fragmentManager, null, C56402yEa.EZpvd(favoritesPo), str);
        return Unit.INSTANCE;
    }
}
