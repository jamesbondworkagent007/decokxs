package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.redbag.bean.GiftInfo;
import com.okinc.business.redbag.bean.MsgType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKRedPacketMessage;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35254nrp;
import o.C35399nuc;
import o.C44105sDn;
import o.C52761wXj;
import o.kOA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33725nDn {
    public static final C33725nDn AEQbTJ = new C33725nDn();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKRedPacketMessage oKRedPacketMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        return true;
    }

    private C33725nDn() {
    }

    public final java.lang.CharSequence OLrzqt(@NotNull android.content.Context context, @NotNull OKRedPacketMessage oKRedPacketMessage, @NotNull OKMessage oKMessage) {
        int i;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String string = context.getString(C35399nuc.LoaderManager.IPostMessageServiceDefault);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.Integer state = oKRedPacketMessage.getState();
        if (state != null && state.intValue() == 202) {
            i = C35399nuc.LoaderManager.config;
        } else if (state != null && state.intValue() == 100) {
            i = C35399nuc.LoaderManager.fJNWhG;
        } else if (state != null && state.intValue() == 101) {
            i = C35399nuc.LoaderManager.RihMUf;
        } else if (state != null && state.intValue() == 104) {
            i = C35399nuc.LoaderManager.invokespecialaVhqwO;
        } else if (state != null && state.intValue() == 103) {
            i = C35399nuc.LoaderManager.invokespecialROgMPW;
        } else if (state != null && state.intValue() == 201) {
            i = C35399nuc.LoaderManager.ICustomTabsServiceStubProxy;
        } else {
            if (state != null && state.intValue() == 102) {
                if (!Intrinsics.EZpvd((java.lang.Object) oKMessage.getSenderUserId(), (java.lang.Object) C44157sFk.KWHzl())) {
                    android.text.SpannableString spannableString = new android.text.SpannableString(string + " " + oKRedPacketMessage.getMessage());
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.dvKsVJ)), 0, string.length(), 33);
                    return spannableString;
                }
                return string + " " + oKRedPacketMessage.getMessage();
            }
            i = C35399nuc.LoaderManager.fJNWhG;
        }
        java.lang.String string2 = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String str = string + " " + string2;
        java.lang.Integer state2 = oKRedPacketMessage.getState();
        int i2 = (state2 != null && state2.intValue() == 101) ? C52761wXj.Activity.frkDMe : C52761wXj.Activity.QwvEab;
        java.lang.Integer state3 = oKRedPacketMessage.getState();
        int length = (state3 != null && state3.intValue() == 101) ? str.length() : string.length();
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, i2)), 0, length, 33);
        return spannableString2;
    }

    public final nMR KWHzl(@NotNull nMR nmr) {
        Intrinsics.checkNotNullParameter(nmr, "");
        android.view.View root = nmr.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(root.getContext(), "");
            int iEZpvd = yII.EZpvd(c33566myq.EZpvd(r5) * 0.6f);
            int iDp2px$default = C55298xhM.dp2px$default(280.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(210.0f, null, 1, null);
            if (iEZpvd >= iDp2px$default) {
                iEZpvd = iDp2px$default;
            } else if (iEZpvd <= iDp2px$default2) {
                iEZpvd = iDp2px$default2;
            }
            layoutParams.width = iEZpvd;
        } else {
            layoutParams = null;
        }
        root.setLayoutParams(layoutParams);
        return nmr;
    }

    public final void AEQbTJ(@NotNull oAC<? extends ViewDataBinding, nMR> oac, @NotNull C35254nrp c35254nrp, @NotNull OKRedPacketMessage oKRedPacketMessage) {
        android.graphics.drawable.Drawable drawableWrap;
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        nMR nmr = (nMR) oac.EZpvd();
        C35254nrp.Application application = C35254nrp.Companion;
        android.content.Context context = nmr.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableKWHzl = application.KWHzl(context, c35254nrp);
        if (drawableKWHzl != null) {
            drawableWrap = DrawableCompat.wrap(drawableKWHzl);
            Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
            DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(oac.itemView.getContext(), C52761wXj.Activity.fkESqH));
        } else {
            drawableWrap = null;
        }
        nmr.AEQbTJ.setBackground(drawableWrap);
        java.lang.Integer scenario = oKRedPacketMessage.getScenario();
        if (scenario != null && scenario.intValue() == 2) {
            EZpvd(oac, c35254nrp, oKRedPacketMessage);
        } else {
            KWHzl(oac, c35254nrp, oKRedPacketMessage);
        }
    }

    public final void KWHzl(oAC<? extends ViewDataBinding, nMR> oac, C35254nrp c35254nrp, OKRedPacketMessage oKRedPacketMessage) {
        android.graphics.drawable.Drawable drawable;
        java.lang.Integer numValueOf;
        ((nMR) oac.EZpvd()).AEQbTJ.setAlpha(Intrinsics.EZpvd(oKRedPacketMessage.getDim(), java.lang.Boolean.TRUE) ? 0.6f : 1.0f);
        int color = ContextCompat.getColor(oac.itemView.getContext(), C52761wXj.Activity.ixgjPv);
        nMR nmr = (nMR) oac.EZpvd();
        nmr.KWHzl.setText(oKRedPacketMessage.getMessage());
        nmr.KWHzl.setTextColor(color);
        nmr.KWHzl.setCompoundDrawables(null, null, null, null);
        nmr.copydefault.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        java.lang.Integer state = oKRedPacketMessage.getState();
        if (state == null || state.intValue() != 102 || (drawable = ContextCompat.getDrawable(nmr.getRoot().getContext(), C52761wXj.TaskDescription.glVQsU)) == null) {
            drawable = null;
        } else {
            drawable.setTint(color);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        nmr.copydefault.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        java.lang.Integer state2 = oKRedPacketMessage.getState();
        nmr.copydefault.setTextAppearance((state2 != null && state2.intValue() == 102) ? C52761wXj.LoaderManager.sSMYrx : C52761wXj.LoaderManager.zuBGHE);
        nmr.copydefault.setTextColor(color);
        nmr.copydefault.setCompoundDrawablePadding(nmr.getRoot().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.flVtFt));
        TextViewCompat.setCompoundDrawableTintList(nmr.KWHzl, android.content.res.ColorStateList.valueOf(color));
        android.widget.TextView textView = nmr.copydefault;
        java.lang.Integer state3 = oKRedPacketMessage.getState();
        if ((state3 != null && state3.intValue() == 100) || (state3 != null && state3.intValue() == 200)) {
            numValueOf = java.lang.Integer.valueOf(C35399nuc.LoaderManager.fJNWhG);
        } else if (state3 != null && state3.intValue() == 102) {
            numValueOf = java.lang.Integer.valueOf(C35399nuc.LoaderManager.Dap);
        } else if (state3 != null && state3.intValue() == 202) {
            numValueOf = java.lang.Integer.valueOf(C35399nuc.LoaderManager.config);
        } else if (state3 != null && state3.intValue() == 101) {
            numValueOf = java.lang.Integer.valueOf(C35399nuc.LoaderManager.RihMUf);
        } else if (state3 != null && state3.intValue() == 104) {
            numValueOf = java.lang.Integer.valueOf(C35399nuc.LoaderManager.invokespecialaVhqwO);
        } else if (state3 != null && state3.intValue() == 103) {
            numValueOf = java.lang.Integer.valueOf(C35399nuc.LoaderManager.invokespecialROgMPW);
        } else {
            numValueOf = (state3 != null && state3.intValue() == 201) ? java.lang.Integer.valueOf(C35399nuc.LoaderManager.ICustomTabsServiceStubProxy) : null;
        }
        textView.setText(numValueOf != null ? textView.getContext().getString(numValueOf.intValue()) : null);
        textView.setTextColor(color);
        android.widget.TextView textView2 = (android.widget.TextView) oac.copydefault().getRoot().findViewById(C44105sDn.ActionBar.QfsBiF);
        if (textView2 != null) {
            java.lang.Integer state4 = oKRedPacketMessage.getState();
            java.lang.Integer numValueOf2 = (state4 != null && state4.intValue() == 100) ? java.lang.Integer.valueOf(C35399nuc.LoaderManager.DXd) : null;
            java.lang.String string = numValueOf2 != null ? textView2.getContext().getString(numValueOf2.intValue()) : null;
            textView2.setText(string);
            textView2.setVisibility(true ^ (string == null || string.length() == 0) ? 0 : 8);
        }
    }

    public final void EZpvd(oAC<? extends ViewDataBinding, nMR> oac, C35254nrp c35254nrp, OKRedPacketMessage oKRedPacketMessage) {
        java.lang.String string;
        java.lang.String str;
        GroupMemberInfo groupMemberInfoOLrzqt;
        ((nMR) oac.EZpvd()).AEQbTJ.setAlpha(Intrinsics.EZpvd(oKRedPacketMessage.getDim(), java.lang.Boolean.TRUE) ? 0.6f : 1.0f);
        int color = ContextCompat.getColor(oac.itemView.getContext(), C52761wXj.Activity.ixgjPv);
        nMR nmr = (nMR) oac.EZpvd();
        java.util.List<java.lang.String> exclusiveGiftReceiverUids = oKRedPacketMessage.getExclusiveGiftReceiverUids();
        java.lang.String strEZpvd = (exclusiveGiftReceiverUids == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(exclusiveGiftReceiverUids)) == null || (groupMemberInfoOLrzqt = sDZ.AEQbTJ.valueOf().OLrzqt(c35254nrp.OLrzqt().getTargetId(), str)) == null) ? null : C44157sFk.EZpvd(groupMemberInfoOLrzqt);
        android.widget.TextView textView = nmr.KWHzl;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.zzJhsT);
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        textView.setText(C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", strEZpvd))));
        java.lang.Integer state = oKRedPacketMessage.getState();
        nmr.copydefault.setTextAppearance((state != null && state.intValue() == 102) ? C52761wXj.LoaderManager.sSMYrx : C52761wXj.LoaderManager.zuBGHE);
        nmr.copydefault.setTextColor(color);
        nmr.copydefault.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        TextViewCompat.setCompoundDrawableTintList(nmr.KWHzl, android.content.res.ColorStateList.valueOf(color));
        android.widget.TextView textView2 = nmr.copydefault;
        java.lang.Integer state2 = oKRedPacketMessage.getState();
        if ((state2 != null && state2.intValue() == 100) || (state2 != null && state2.intValue() == 200)) {
            string = textView2.getContext().getString(C35399nuc.LoaderManager.fJNWhG);
        } else if (state2 != null && state2.intValue() == 102) {
            string = oKRedPacketMessage.getMessage();
        } else if (state2 != null && state2.intValue() == 202) {
            string = textView2.getContext().getString(C35399nuc.LoaderManager.config);
        } else if (state2 != null && state2.intValue() == 101) {
            string = textView2.getContext().getString(C35399nuc.LoaderManager.RihMUf);
        } else if (state2 != null && state2.intValue() == 104) {
            string = textView2.getContext().getString(C35399nuc.LoaderManager.invokespecialaVhqwO);
        } else if (state2 != null && state2.intValue() == 103) {
            string = textView2.getContext().getString(C35399nuc.LoaderManager.invokespecialROgMPW);
        } else {
            string = (state2 != null && state2.intValue() == 201) ? textView2.getContext().getString(C35399nuc.LoaderManager.ICustomTabsServiceStubProxy) : null;
        }
        textView2.setText(string);
        textView2.setTextColor(color);
        android.widget.TextView textView3 = (android.widget.TextView) oac.copydefault().getRoot().findViewById(C44105sDn.ActionBar.QfsBiF);
        if (textView3 != null) {
            java.lang.Integer state3 = oKRedPacketMessage.getState();
            java.lang.Integer numValueOf = (state3 != null && state3.intValue() == 100) ? java.lang.Integer.valueOf(C35399nuc.LoaderManager.DXd) : null;
            java.lang.String string2 = numValueOf != null ? textView3.getContext().getString(numValueOf.intValue()) : null;
            textView3.setText(string2);
            textView3.setVisibility(true ^ (string2 == null || string2.length() == 0) ? 0 : 8);
        }
    }

    public final void KWHzl(@NotNull OKRedPacketMessage oKRedPacketMessage, @NotNull android.app.Activity activity, @NotNull java.lang.String str) {
        kOA koa;
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_ToolTip_Gift_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33725nDn.KWHzl((EventParamsList) obj);
            }
        });
        java.lang.String giftId = oKRedPacketMessage.getGiftId();
        if (giftId == null || (koa = (kOA) C43251rlk.OLrzqt(kOA.class)) == null) {
            return;
        }
        kOA.TaskDescription.claimGift$default(koa, new GiftInfo(giftId, str, (java.lang.String) null, 4, (DefaultConstructorMarker) null), activity, null, MsgType.IM_CARD, 4, null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "IMChat_ToolTip_Gift_Click", "", false, 4, null);
        return Unit.INSTANCE;
    }
}
