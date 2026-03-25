package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.internal.view.SupportMenu;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oHK extends AppCompatTextView {
    public Function1<? super oHD, Unit> AEQbTJ;
    public final java.util.Set<oHM> EZpvd;
    public int KWHzl;
    public final java.util.Map<oHM, java.util.HashSet<android.text.style.CharacterStyle>> djBIcL;
    public int gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final java.lang.String OLrzqt = oHK.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super oHD, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormalTextColor(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPressedTextColor(int i) {
        this.gEmmrt = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oHK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = new LinkedHashMap();
        this.EZpvd = new LinkedHashSet();
        this.gEmmrt = -3355444;
        this.KWHzl = SupportMenu.CATEGORY_MASK;
        setHighlightColor(0);
        setMovementMethod(new oHO());
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void EZpvd(oHM... ohmArr) {
        C56406yEe.KWHzl(this.EZpvd, ohmArr);
    }

    public final void AEQbTJ(oHM ohm, android.text.style.CharacterStyle... characterStyleArr) {
        this.djBIcL.put(ohm, yDV.zuBGHE(characterStyleArr));
    }

    public final android.text.SpannableString OLrzqt(java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return new android.text.SpannableString("");
        }
        java.util.List<oHD> listKWHzl = KWHzl(charSequence);
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence.toString());
        for (oHD ohd : listKWHzl) {
            oHM ohmEZpvd = ohd.EZpvd();
            EZpvd(spannableString, new Application(ohd, this.KWHzl, this.gEmmrt), ohd);
            java.util.HashSet<android.text.style.CharacterStyle> hashSet = this.djBIcL.get(ohmEZpvd);
            if (hashSet != null) {
                java.util.Iterator<T> it = hashSet.iterator();
                while (it.hasNext()) {
                    android.text.style.CharacterStyle characterStyleWrap = android.text.style.CharacterStyle.wrap((android.text.style.CharacterStyle) it.next());
                    Intrinsics.checkNotNullExpressionValue(characterStyleWrap, "");
                    EZpvd(spannableString, characterStyleWrap, ohd);
                }
            }
        }
        return spannableString;
    }

    public static final class Application extends oHS {
        public final /* synthetic */ oHD OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(oHD ohd, int i, int i2) {
            super(i, i2);
            this.OLrzqt = ohd;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Function1 function1;
            Intrinsics.checkNotNullParameter(view, "");
            if (AEQbTJ() || (function1 = oHK.this.AEQbTJ) == null) {
                return;
            }
            function1.invoke(this.OLrzqt);
        }
    }

    public final java.util.List<oHD> KWHzl(java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (oHM ohm : this.EZpvd) {
            Matcher matcher = ohm.KWHzl().matcher(charSequence);
            while (matcher.find()) {
                java.lang.String strGroup = matcher.group();
                int iStart = matcher.start();
                int iEnd = matcher.end();
                Intrinsics.copydefault((java.lang.Object) strGroup);
                arrayList.add(new oHD(iStart, iEnd, strGroup, strGroup, ohm));
            }
        }
        return arrayList;
    }

    public final void EZpvd(android.text.SpannableString spannableString, java.lang.Object obj, oHD ohd) {
        spannableString.setSpan(obj, ohd.AEQbTJ(), ohd.KWHzl(), 33);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.text.Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        int maxLines = getMaxLines();
        if (1 > maxLines || maxLines >= lineCount) {
            return;
        }
        int lineBottom = layout.getLineBottom(getMaxLines() - 1);
        int compoundPaddingTop = getCompoundPaddingTop();
        setMeasuredDimension(getMeasuredWidth(), lineBottom + compoundPaddingTop + getCompoundPaddingBottom());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oHK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setIMStyle$default(oHK ohk, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        ohk.setIMStyle(function1);
    }

    public final void setIMStyle(final Function1<? super java.lang.String, Unit> function1) {
        oHN ohn = oHN.copydefault;
        oHL ohl = oHL.AEQbTJ;
        oHP ohp = oHP.AEQbTJ;
        EZpvd(ohn, ohl, ohp);
        AEQbTJ(ohn, new android.text.style.UnderlineSpan());
        AEQbTJ(ohl, new android.text.style.UnderlineSpan());
        AEQbTJ(ohp, new android.text.style.UnderlineSpan());
        EZpvd(new Function1() { // from class: o.oHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oHK.AEQbTJ(this.OLrzqt, function1, (oHD) obj);
            }
        });
    }

    public static final Unit AEQbTJ(oHK ohk, Function1 function1, oHD ohd) {
        InterfaceC43294rma interfaceC43294rma;
        InterfaceC43294rma interfaceC43294rma2;
        Intrinsics.checkNotNullParameter(ohd, "");
        oHM ohmEZpvd = ohd.EZpvd();
        if (ohmEZpvd instanceof oHL) {
            java.lang.String strOLrzqt = ohd.OLrzqt();
            if (!android.text.TextUtils.isEmpty(strOLrzqt)) {
                android.content.Context context = ohk.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                android.app.Activity activityCopydefault = ohk.copydefault(context);
                if (activityCopydefault != null && (interfaceC43294rma2 = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class)) != null) {
                    interfaceC43294rma2.KWHzl(activityCopydefault, strOLrzqt, interfaceC43294rma2.fetchVPNInfo(strOLrzqt), new Function1() { // from class: o.oHG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oHK.KWHzl((AbstractC43238rlX) obj);
                        }
                    });
                }
            }
            if (function1 != null) {
                function1.invoke(ohd.OLrzqt());
            }
        } else if (ohmEZpvd instanceof oHN) {
            android.content.Context context2 = ohk.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C33058mpL.OLrzqt(context2, ohd.OLrzqt(), "", "");
            if (function1 != null) {
                function1.invoke(ohd.OLrzqt());
            }
        } else {
            if (!(ohmEZpvd instanceof oHP)) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String strOLrzqt2 = ohd.OLrzqt();
            if (!android.text.TextUtils.isEmpty(strOLrzqt2)) {
                java.lang.String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(strOLrzqt2, "://", (java.lang.String) null, 2, (java.lang.Object) null);
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                if (activityAEQbTJ != null && (interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class)) != null) {
                    InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activityAEQbTJ, strSubstringAfter$default, null, new Function1() { // from class: o.oHH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return oHK.AEQbTJ((AbstractC43238rlX) obj);
                        }
                    }, 4, null);
                }
            }
            if (function1 != null) {
                function1.invoke(ohd.OLrzqt());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final android.app.Activity copydefault(android.content.Context context) {
        while (context != null) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            android.content.ContextWrapper contextWrapper = context instanceof android.content.ContextWrapper ? (android.content.ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return null;
    }
}
