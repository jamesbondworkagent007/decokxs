package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24324ibg {
    public final java.lang.String AYXKKw;
    public final android.content.Context EZpvd;
    public int KWHzl;
    public final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt;
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<kotlin.Pair<java.lang.Integer, java.lang.Object>>> copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.content.Context), (r2v0 int) A[MD:(android.content.Context, int):void (m)] call: o.ibg.<init>(android.content.Context, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C24324ibg(android.content.Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.content.Context), (r2v0 java.lang.String) A[MD:(android.content.Context, java.lang.String):void (m)] call: o.ibg.<init>(android.content.Context, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C24324ibg(android.content.Context context, java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str);
    }

    public C24324ibg(android.content.Context context, java.lang.String str) {
        this.EZpvd = context;
        this.AYXKKw = str;
        this.OLrzqt = new java.util.HashMap<>();
        this.copydefault = new java.util.HashMap<>();
        this.KWHzl = -1;
    }

    /* JADX INFO: renamed from: o.ibg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ibg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C24324ibg EZpvd(int i) {
            return EZpvd(C43246rlf.OLrzqt.valueOf(), i);
        }

        public final C24324ibg EZpvd(@NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            return new C24324ibg(context, i, (DefaultConstructorMarker) null);
        }

        public final C24324ibg KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return copydefault(C43246rlf.OLrzqt.valueOf(), str);
        }

        public final C24324ibg copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new C24324ibg(context, str, (DefaultConstructorMarker) null);
        }
    }

    public C24324ibg(android.content.Context context, int i) {
        this(context, "");
        this.KWHzl = i;
    }

    /* JADX INFO: renamed from: o.ibg$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.graphics.Typeface AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;
        public final /* synthetic */ int OLrzqt;

        public ActionBar(Function0<Unit> function0, boolean z, android.graphics.Typeface typeface, int i) {
            this.KWHzl = function0;
            this.EZpvd = z;
            this.AEQbTJ = typeface;
            this.OLrzqt = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(this.EZpvd);
            textPaint.setTypeface(this.AEQbTJ);
            textPaint.setColor(this.OLrzqt);
        }
    }

    public final C24324ibg OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.graphics.Typeface typeface, int i, int i2, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt.put(str, str2);
        AEQbTJ(str2, new ActionBar(function0, z, typeface, i), i2);
        return this;
    }

    public static /* synthetic */ C24324ibg addBackgroundColor$default(C24324ibg c24324ibg, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return c24324ibg.OLrzqt(str, i, i2);
    }

    public final C24324ibg OLrzqt(@NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str, new android.text.style.BackgroundColorSpan(i), 0);
        return this;
    }

    public static /* synthetic */ C24324ibg addSpanWithColor$default(C24324ibg c24324ibg, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return c24324ibg.EZpvd(str, i, i2);
    }

    public final C24324ibg EZpvd(@NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str, new android.text.style.ForegroundColorSpan(i), i2);
        return this;
    }

    public final void AEQbTJ(java.lang.String str, java.lang.Object obj, int i) {
        java.util.HashMap<java.lang.String, java.util.ArrayList<kotlin.Pair<java.lang.Integer, java.lang.Object>>> map = this.copydefault;
        java.util.ArrayList<kotlin.Pair<java.lang.Integer, java.lang.Object>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        arrayList.add(C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), obj));
        map.put(str, arrayList);
    }

    public final android.text.Spannable AEQbTJ() {
        int i = this.KWHzl;
        java.lang.String strCopydefault = i == -1 ? this.AYXKKw : C33069mpW.copydefault(i, this.OLrzqt);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        for (Map.Entry<java.lang.String, java.util.ArrayList<kotlin.Pair<java.lang.Integer, java.lang.Object>>> entry : this.copydefault.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                kotlin.Pair pair = (kotlin.Pair) it.next();
                int iIntValue = ((java.lang.Number) pair.component1()).intValue();
                java.lang.Object objComponent2 = pair.component2();
                int iIndexOf$default = 0;
                for (int i2 = iIntValue; i2 != 0; i2--) {
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, key, iIndexOf$default, false, 4, (java.lang.Object) null) + key.length();
                }
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, key, iIndexOf$default, false, 4, (java.lang.Object) null);
                if (iIndexOf$default2 != -1) {
                    spannableStringBuilder.setSpan(objComponent2, iIndexOf$default2, key.length() + iIndexOf$default2, 33);
                }
            }
        }
        return spannableStringBuilder;
    }
}
