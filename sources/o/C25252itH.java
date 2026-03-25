package o;

import android.widget.CompoundButton;
import com.okinc.business.dexlogic.bean.ContentTip;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.bean.Extra;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25252itH extends android.widget.LinearLayout {
    public boolean KWHzl;
    public hFP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecked(boolean z) {
        this.KWHzl = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25252itH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25252itH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25252itH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25252itH(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void OLrzqt(CrossChainBridgeRulesData crossChainBridgeRulesData) {
        ContentTip contentTip;
        Extra extra;
        ContentTip contentTip2;
        Extra extra2;
        if (getContext() == null) {
            return;
        }
        this.copydefault = hFP.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        java.lang.String bridgeName = null;
        java.lang.String bridgeContact = (crossChainBridgeRulesData == null || (contentTip2 = crossChainBridgeRulesData.getContentTip()) == null || (extra2 = contentTip2.getExtra()) == null) ? null : extra2.getBridgeContact();
        if (bridgeContact == null) {
            bridgeContact = "";
        }
        if (crossChainBridgeRulesData != null && (contentTip = crossChainBridgeRulesData.getContentTip()) != null && (extra = contentTip.getExtra()) != null) {
            bridgeName = extra.getBridgeName();
        }
        java.lang.String str = bridgeName != null ? bridgeName : "";
        hFP hfp = this.copydefault;
        if (hfp != null) {
            hfp.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.itF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C25252itH.copydefault(this.OLrzqt, compoundButton, z);
                }
            });
            hfp.EZpvd.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            hfp.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            hfp.EZpvd.setText(EZpvd(str, bridgeContact));
            hfp.OLrzqt.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.onRemoveQueueItem));
        }
    }

    public static final void copydefault(C25252itH c25252itH, android.widget.CompoundButton compoundButton, boolean z) {
        c25252itH.KWHzl = z;
    }

    public final java.lang.CharSequence EZpvd(java.lang.String str, final java.lang.String str2) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.onSetCaptioningEnabled);
        return C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onSetRepeatMode, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("thirdParty", str), C56390yDp.OLrzqt("freezeContent", strAYXKKw), C56390yDp.OLrzqt("thirdPartyContact", str2))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.itE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25252itH.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.itG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25252itH.AEQbTJ(this.EZpvd, str2, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit KWHzl(C25252itH c25252itH, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = c25252itH.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.DeEinT)));
        list.add(new android.text.style.TextAppearanceSpan(c25252itH.getContext(), C32113mPz.Dialog.zuBGHE));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.itH$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ C25252itH AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;

        public Activity(java.lang.String str, C25252itH c25252itH) {
            this.KWHzl = str;
            this.AEQbTJ = c25252itH;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            try {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl)) {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
                    intent.setData(android.net.Uri.parse(androidx.core.net.MailTo.MAILTO_SCHEME + this.KWHzl));
                    this.AEQbTJ.getContext().startActivity(intent);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static final Unit AEQbTJ(C25252itH c25252itH, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new Activity(str, c25252itH));
        android.content.Context context = c25252itH.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.iLWfRf)));
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.Boolean bool) {
        wYK wyk;
        wYK wyk2;
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            hFP hfp = this.copydefault;
            if (hfp == null || (wyk2 = hfp.copydefault) == null) {
                return;
            }
            wyk2.setVisibility(0);
            return;
        }
        hFP hfp2 = this.copydefault;
        if (hfp2 == null || (wyk = hfp2.copydefault) == null) {
            return;
        }
        wyk.setVisibility(8);
    }
}
