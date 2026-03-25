package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xeK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55137xeK {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public InterfaceC55228xfw EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.xeK.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C55137xeK(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55137xeK OLrzqt(@NotNull InterfaceC55228xfw interfaceC55228xfw) {
        Intrinsics.checkNotNullParameter(interfaceC55228xfw, "");
        this.EZpvd = interfaceC55228xfw;
        return this;
    }

    public C55137xeK(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX INFO: renamed from: o.xeK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xeK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C55137xeK KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new C55137xeK(str, null);
        }
    }

    public static final void OLrzqt(android.content.Context context, C55137xeK c55137xeK, final Function1 function1) {
        final android.text.Spannable spannableAEQbTJ = new C55135xeI(context, c55137xeK.EZpvd).AEQbTJ(c55137xeK.OLrzqt);
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.xeL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55137xeK.AEQbTJ(function1, spannableAEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, android.text.Spannable spannable) {
        Intrinsics.copydefault(spannable);
        function1.invoke(spannable);
    }

    public final void KWHzl(@NotNull final android.content.Context context, @NotNull final Function1<? super java.lang.CharSequence, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        new java.lang.Thread(new java.lang.Runnable() { // from class: o.xeN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55137xeK.OLrzqt(context, this, function1);
            }
        }).start();
    }

    public final void EZpvd(@NotNull final android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        KWHzl(context, new Function1() { // from class: o.xeM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55137xeK.KWHzl(textView, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit KWHzl(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        textView.setText(charSequence);
        textView.setMovementMethod(C55134xeH.OLrzqt());
        return Unit.INSTANCE;
    }
}
