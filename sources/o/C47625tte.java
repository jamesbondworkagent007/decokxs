package o;

import android.view.View;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;
import androidx.core.view.ViewCompat;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.planet.biz_content.input.data.InputHyperlinkType;
import com.okinc.planet.biz_content.input.data.SerializableInputSpanData;
import com.okinc.planet.biz_content.input.data.SerializableInputTextState;
import com.okinc.uilab.edit.OKEditText;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47625tte extends android.widget.LinearLayout {
    public C47574tsg AEQbTJ;
    public ActionBar AYXKKw;
    public boolean AhwBna;
    public int AkhnZx;
    public int DbNXlk;
    public final tOK EZpvd;
    public TaskDescription KWHzl;
    public java.util.Set<java.lang.String> OLrzqt;
    public Application copydefault;
    public java.util.List<Activity> djBIcL;
    public FragmentManager fetchVPNInfo;
    public int gEmmrt;
    public StateListAnimator valueOf;
    public java.lang.String values;

    /* JADX INFO: renamed from: o.tte$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public interface ActionBar {
        void AEQbTJ(@NotNull java.util.List<? extends android.net.Uri> list);
    }

    /* JADX INFO: renamed from: o.tte$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public interface Application {
        void copydefault(int i);
    }

    /* JADX INFO: renamed from: o.tte$FragmentManager */
    /* JADX INFO: loaded from: classes19.dex */
    public interface FragmentManager {
        void copydefault(@NotNull java.lang.String str, int i, int i2);
    }

    /* JADX INFO: renamed from: o.tte$PendingIntent */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class PendingIntent {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputHyperlinkType.values().length];
            try {
                iArr[InputHyperlinkType.TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InputHyperlinkType.TOPIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InputHyperlinkType.LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.tte$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull java.lang.String str);

        void OLrzqt(@NotNull java.lang.String str);

        void copydefault(@NotNull java.lang.String str, int i);
    }

    /* JADX INFO: renamed from: o.tte$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public interface TaskDescription {
        void EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47625tte(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47625tte(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFocusChangedListener(TaskDescription taskDescription) {
        this.KWHzl = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnHyperlinkPositionChangedListener(Application application) {
        this.copydefault = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnImagesPastedListener(ActionBar actionBar) {
        this.AYXKKw = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnKeywordDetectedListener(StateListAnimator stateListAnimator) {
        this.valueOf = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTextChangedListener(FragmentManager fragmentManager) {
        this.fetchVPNInfo = fragmentManager;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:45) call: o.tte.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C47625tte(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47625tte(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        tOK tokKWHzl = tOK.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(tokKWHzl, "");
        this.EZpvd = tokKWHzl;
        this.AEQbTJ = new C47574tsg(null, null, 0, 0, false, false, 0, false, false, 0, false, false, null, 0, 0, 0, 0, 131071, null);
        this.values = "";
        this.OLrzqt = yEE.copydefault();
        this.djBIcL = yDY.AhwBna();
        this.AkhnZx = -1;
        setupTextWatcher();
        setupCursorPositionListener();
        setupImageReceiveContentListener();
        this.gEmmrt = tokKWHzl.KWHzl.getInputType();
    }

    /* JADX INFO: renamed from: o.tte$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((Activity) t).AEQbTJ()), java.lang.Integer.valueOf(((Activity) t2).AEQbTJ()));
        }
    }

    public final void copydefault(@NotNull C47574tsg c47574tsg) {
        Intrinsics.checkNotNullParameter(c47574tsg, "");
        this.AEQbTJ = c47574tsg;
        OLrzqt();
        DbNXlk();
    }

    public final void EZpvd(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = CollectionsKt___CollectionsKt.OqFWZa(list);
        android.text.Editable text = this.EZpvd.KWHzl.getText();
        if (text == null) {
            return;
        }
        AhwBna(text);
        EZpvd(text);
    }

    public final void AhwBna(android.text.Editable editable) {
        java.lang.Object next;
        java.util.List<java.lang.String> listKWHzl = C46454tUy.OLrzqt.KWHzl(editable.toString());
        java.util.Iterator itEZpvd = yHX.EZpvd((C47635tto[]) editable.getSpans(0, editable.length(), C47635tto.class));
        while (true) {
            java.lang.Object obj = null;
            if (!itEZpvd.hasNext()) {
                break;
            }
            java.lang.Object obj2 = (C47635tto) itEZpvd.next();
            int spanStart = editable.getSpanStart(obj2);
            int spanEnd = editable.getSpanEnd(obj2);
            if (spanStart >= 0 && spanEnd > spanStart && spanEnd <= editable.length()) {
                java.lang.String string = editable.subSequence(spanStart, spanEnd).toString();
                for (java.lang.Object obj3 : listKWHzl) {
                    java.lang.String str = (java.lang.String) obj3;
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) string) || C59449zhJ.startsWith$default(str, string, false, 2, null)) {
                        obj = obj3;
                        break;
                    }
                }
                java.lang.String str2 = (java.lang.String) obj;
                if (str2 != null && !this.OLrzqt.contains(str2)) {
                    editable.removeSpan(obj2);
                }
            }
        }
        java.util.Iterator itEZpvd2 = yHX.EZpvd((C47631ttk[]) editable.getSpans(0, editable.length(), C47631ttk.class));
        while (itEZpvd2.hasNext()) {
            C47631ttk c47631ttk = (C47631ttk) itEZpvd2.next();
            if (c47631ttk.AEQbTJ() == InputHyperlinkType.LINK) {
                int spanStart2 = editable.getSpanStart(c47631ttk);
                int spanEnd2 = editable.getSpanEnd(c47631ttk);
                if (spanStart2 >= 0 && spanEnd2 > spanStart2 && spanEnd2 <= editable.length()) {
                    java.lang.String string2 = editable.subSequence(spanStart2, spanEnd2).toString();
                    java.util.Iterator<T> it = listKWHzl.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        java.lang.String str3 = (java.lang.String) next;
                        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) string2) || C59449zhJ.startsWith$default(str3, string2, false, 2, null)) {
                            break;
                        }
                    }
                    java.lang.String str4 = (java.lang.String) next;
                    if (str4 != null && !this.OLrzqt.contains(str4)) {
                        editable.removeSpan(c47631ttk);
                    }
                }
            }
        }
    }

    public final void isConnected() {
        int iGEmmrt = gEmmrt();
        Application application = this.copydefault;
        if (application != null) {
            application.copydefault(iGEmmrt);
        }
    }

    public final java.lang.String values() {
        java.lang.String string;
        android.text.Editable text = this.EZpvd.KWHzl.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    public final void setText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.KWHzl.setText(str);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OKEditText oKEditText = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        android.text.Editable text = oKEditText.getText();
        int selectionStart = oKEditText.getSelectionStart();
        if (text == null || selectionStart < 0) {
            return;
        }
        text.insert(selectionStart, str);
    }

    public final void AEQbTJ() {
        this.EZpvd.KWHzl.setText("");
    }

    public final void AkhnZx() {
        this.EZpvd.KWHzl.requestFocus();
        this.EZpvd.KWHzl.post(new java.lang.Runnable() { // from class: o.tth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47625tte.djBIcL(this.KWHzl);
            }
        });
        C33570myu.AEQbTJ(getContext(), (android.widget.EditText) this.EZpvd.KWHzl);
    }

    public static final void djBIcL(C47625tte c47625tte) {
        android.text.Editable text = c47625tte.EZpvd.KWHzl.getText();
        int length = text != null ? text.length() : 0;
        int i = c47625tte.DbNXlk;
        if (i <= 0) {
            i = length;
        }
        try {
            c47625tte.EZpvd.KWHzl.setSelection(i);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            c47625tte.EZpvd.KWHzl.setSelection(length);
        }
    }

    public final void KWHzl() {
        this.EZpvd.KWHzl.clearFocus();
        C33570myu.OLrzqt(C35334ntP.KWHzl(this), this.EZpvd.KWHzl);
    }

    public final int AhwBna() {
        return this.EZpvd.KWHzl.getSelectionStart();
    }

    public final void AYXKKw() {
        this.AhwBna = true;
        this.AkhnZx = djBIcL();
        this.EZpvd.KWHzl.setInputType(this.gEmmrt | 655360);
    }

    public final void copydefault() {
        this.AhwBna = false;
        this.AkhnZx = -1;
        this.EZpvd.KWHzl.setInputType(this.gEmmrt);
    }

    public final SerializableInputTextState fetchVPNInfo() {
        android.text.Editable text = this.EZpvd.KWHzl.getText();
        if (text == null) {
            return new SerializableInputTextState("", yDY.AhwBna());
        }
        java.lang.String string = text.toString();
        C47631ttk[] c47631ttkArr = (C47631ttk[]) text.getSpans(0, text.length(), C47631ttk.class);
        Intrinsics.copydefault(c47631ttkArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C47631ttk c47631ttk : c47631ttkArr) {
            int spanStart = text.getSpanStart(c47631ttk);
            int spanEnd = text.getSpanEnd(c47631ttk);
            SerializableInputSpanData serializableInputSpanData = (spanStart < 0 || spanEnd <= spanStart || spanEnd > text.length()) ? null : new SerializableInputSpanData(spanStart, spanEnd, text.subSequence(spanStart, spanEnd).toString(), c47631ttk.KWHzl(), c47631ttk.AEQbTJ(), c47631ttk.OLrzqt(), C52761wXj.Activity.dvKsVJ);
            if (serializableInputSpanData != null) {
                arrayList.add(serializableInputSpanData);
            }
        }
        return new SerializableInputTextState(string, arrayList);
    }

    public final void EZpvd(@NotNull final SerializableInputTextState serializableInputTextState) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        this.EZpvd.KWHzl.setText(serializableInputTextState.getPlainText());
        this.EZpvd.KWHzl.post(new java.lang.Runnable() { // from class: o.ttn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47625tte.AEQbTJ(this.OLrzqt, serializableInputTextState);
            }
        });
    }

    public static final void AEQbTJ(C47625tte c47625tte, SerializableInputTextState serializableInputTextState) {
        android.text.Editable text = c47625tte.EZpvd.KWHzl.getText();
        if (text == null) {
            return;
        }
        for (SerializableInputSpanData serializableInputSpanData : serializableInputTextState.getSpans()) {
            if (serializableInputSpanData.getStartPosition() >= 0 && serializableInputSpanData.getEndPosition() <= text.length() && serializableInputSpanData.getStartPosition() < serializableInputSpanData.getEndPosition()) {
                text.setSpan(new C47631ttk(serializableInputSpanData.getText(), c47625tte.getResources().getColor(serializableInputSpanData.getColorResId(), c47625tte.getContext().getTheme()), serializableInputSpanData.getSymbol(), serializableInputSpanData.getType(), serializableInputSpanData.getActivityKey()), serializableInputSpanData.getStartPosition(), serializableInputSpanData.getEndPosition(), 33);
            }
        }
        if (c47625tte.AEQbTJ.valueOf() > 0 && text.length() > 0) {
            c47625tte.KWHzl(text);
        }
        if (c47625tte.AEQbTJ.gEmmrt()) {
            c47625tte.EZpvd(text);
        }
        c47625tte.isConnected();
    }

    public final int gEmmrt() {
        java.util.List<Activity> listValueOf = valueOf();
        int i = 0;
        if (!(listValueOf instanceof java.util.Collection) || !listValueOf.isEmpty()) {
            java.util.Iterator<T> it = listValueOf.iterator();
            while (it.hasNext()) {
                if (((Activity) it.next()).EZpvd() != InputHyperlinkType.LINK && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        return i;
    }

    public final java.util.List<Activity> valueOf() {
        android.text.Editable text = this.EZpvd.KWHzl.getText();
        if (text == null) {
            return yDY.AhwBna();
        }
        C47631ttk[] c47631ttkArr = (C47631ttk[]) text.getSpans(0, text.length(), C47631ttk.class);
        Intrinsics.copydefault(c47631ttkArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C47631ttk c47631ttk : c47631ttkArr) {
            int spanStart = text.getSpanStart(c47631ttk);
            int spanEnd = text.getSpanEnd(c47631ttk);
            Activity activity = (spanStart < 0 || spanEnd <= spanStart) ? null : new Activity(c47631ttk.KWHzl(), c47631ttk.AEQbTJ(), spanStart, spanEnd, c47631ttk.OLrzqt());
            if (activity != null) {
                arrayList.add(activity);
            }
        }
        return CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) this.djBIcL), new Fragment());
    }

    /* JADX INFO: renamed from: o.tte$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        public final int AEQbTJ;
        public final java.lang.String EZpvd;
        public final InputHyperlinkType KWHzl;
        public final int OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, InputHyperlinkType inputHyperlinkType, int i, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i3 & 2) != 0) {
                inputHyperlinkType = activity.KWHzl;
            }
            InputHyperlinkType inputHyperlinkType2 = inputHyperlinkType;
            if ((i3 & 4) != 0) {
                i = activity.OLrzqt;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = activity.AEQbTJ;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                str2 = activity.copydefault;
            }
            return activity.AEQbTJ(str, inputHyperlinkType2, i4, i5, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str, @NotNull InputHyperlinkType inputHyperlinkType, int i, int i2, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, inputHyperlinkType, i, i2, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InputHyperlinkType EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && this.KWHzl == activity.KWHzl && this.OLrzqt == activity.OLrzqt && this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HyperlinkInfo(symbol=" + this.EZpvd + ", type=" + this.KWHzl + ", startPosition=" + this.OLrzqt + ", endPosition=" + this.AEQbTJ + ", activityKey=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull InputHyperlinkType inputHyperlinkType, int i, int i2, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.KWHzl = inputHyperlinkType;
            this.OLrzqt = i;
            this.AEQbTJ = i2;
            this.copydefault = str2;
        }
    }

    public final void AEQbTJ(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        final android.text.Editable text = this.EZpvd.KWHzl.getText();
        if (text == null) {
            return;
        }
        this.EZpvd.KWHzl.post(new java.lang.Runnable() { // from class: o.ttj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47625tte.copydefault(text, list, this);
            }
        });
    }

    public static final void copydefault(android.text.Editable editable, java.util.List list, C47625tte c47625tte) {
        java.util.Iterator itEZpvd = yHX.EZpvd((C47631ttk[]) editable.getSpans(0, editable.length(), C47631ttk.class));
        boolean z = false;
        while (itEZpvd.hasNext()) {
            C47631ttk c47631ttk = (C47631ttk) itEZpvd.next();
            if (c47631ttk.AEQbTJ() == InputHyperlinkType.TOPIC || c47631ttk.AEQbTJ() == InputHyperlinkType.TOKEN) {
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.lang.String strSubstring = (java.lang.String) it.next();
                            if (C59449zhJ.startsWith$default(strSubstring, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, null)) {
                                strSubstring = strSubstring.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            } else if (C59449zhJ.startsWith$default(strSubstring, "$", false, 2, null)) {
                                strSubstring = strSubstring.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            }
                            if (Intrinsics.EZpvd((java.lang.Object) c47631ttk.KWHzl(), (java.lang.Object) strSubstring)) {
                                int spanStart = editable.getSpanStart(c47631ttk);
                                int spanEnd = editable.getSpanEnd(c47631ttk);
                                editable.removeSpan(c47631ttk);
                                if (spanStart >= 0 && spanEnd <= editable.length() && spanStart < spanEnd) {
                                    editable.subSequence(spanStart, spanEnd).toString();
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            c47625tte.AEQbTJ(editable);
            if (c47625tte.AEQbTJ.gEmmrt()) {
                c47625tte.EZpvd(editable);
            }
            c47625tte.isConnected();
        }
    }

    public final java.util.List<java.lang.Integer> OLrzqt(@NotNull java.lang.String str, @NotNull InputHyperlinkType inputHyperlinkType) {
        Pattern patternCompile;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
        java.lang.String strValues = values();
        java.util.List<Activity> listValueOf = valueOf();
        int i = PendingIntent.copydefault[inputHyperlinkType.ordinal()];
        if (i == 1) {
            patternCompile = Pattern.compile("\\$" + str + "\\s");
        } else if (i == 2) {
            patternCompile = Pattern.compile(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str + "\\s");
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            patternCompile = Pattern.compile(Pattern.quote(str));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Matcher matcher = patternCompile.matcher(strValues);
        while (matcher.find()) {
            arrayList.add(java.lang.Integer.valueOf(matcher.start()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList<Activity> arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : listValueOf) {
            Activity activity = (Activity) obj;
            if (Intrinsics.EZpvd((java.lang.Object) activity.OLrzqt(), (java.lang.Object) str) && activity.EZpvd() == inputHyperlinkType) {
                arrayList3.add(obj);
            }
        }
        for (Activity activity2 : arrayList3) {
            java.util.Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((java.lang.Number) it.next()).intValue() == activity2.AEQbTJ()) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                arrayList2.add(java.lang.Integer.valueOf(i2 + 1));
            }
        }
        return CollectionsKt___CollectionsKt.AxsJAYaxsJAY(arrayList2);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(str, "$", InputHyperlinkType.TOKEN, "");
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, InputHyperlinkType.TOPIC, str2);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, InputHyperlinkType inputHyperlinkType, java.lang.String str3) {
        int selectionStart;
        int length;
        OKEditText oKEditText = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        android.text.Editable text = oKEditText.getText();
        if (text != null && (selectionStart = oKEditText.getSelectionStart()) >= 0) {
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) text.toString(), str2, selectionStart - 1, false, 4, (java.lang.Object) null);
            if (this.AhwBna && iLastIndexOf$default >= 0) {
                int i = iLastIndexOf$default + 1;
                text.replace(i, selectionStart, str + " ");
                int length2 = str.length();
                oKEditText.setSelection(str.length() + i + 1);
                length = length2 + i + 1;
                selectionStart = iLastIndexOf$default;
            } else {
                text.insert(selectionStart, str2 + str + " ");
                int i2 = selectionStart + 1;
                length = str.length() + i2 + 1;
                oKEditText.setSelection(i2 + str.length() + 1);
            }
            if (selectionStart >= text.length() || length > text.length()) {
                return;
            }
            text.setSpan(new C47631ttk(text.subSequence(selectionStart, length).toString(), getResources().getColor(C52761wXj.Activity.dvKsVJ, getContext().getTheme()), str, inputHyperlinkType, str3), selectionStart, length, 33);
            isConnected();
            AEQbTJ(text);
            if (this.AEQbTJ.gEmmrt()) {
                EZpvd(text);
            }
        }
    }

    /* JADX INFO: renamed from: o.tte$LoaderManager */
    public static final class LoaderManager implements android.text.TextWatcher {
        public LoaderManager() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.lang.String string;
            C47625tte c47625tte = C47625tte.this;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            c47625tte.values = string;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.lang.String string;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            int length = string.length();
            int iValueOf = C47625tte.this.AEQbTJ.valueOf();
            FragmentManager fragmentManager = C47625tte.this.fetchVPNInfo;
            if (fragmentManager != null) {
                fragmentManager.copydefault(string, length, iValueOf);
            }
            if (i3 > 0) {
                C47625tte.this.EZpvd(string, C47625tte.this.EZpvd.KWHzl.getSelectionStart());
            }
            if (i2 > i3) {
                C47625tte.this.EZpvd();
            }
            if (!C47625tte.this.AhwBna || i2 <= i3) {
                return;
            }
            C47625tte c47625tte = C47625tte.this;
            c47625tte.AEQbTJ(c47625tte.values, string, i, i2);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (editable != null) {
                if (C47625tte.this.AEQbTJ.valueOf() > 0 && editable.length() > 0 && (C47625tte.this.values.length() > C47625tte.this.AEQbTJ.valueOf() || editable.length() > C47625tte.this.AEQbTJ.valueOf())) {
                    C47625tte.this.AEQbTJ(editable);
                }
                if (C47625tte.this.AEQbTJ.gEmmrt()) {
                    C47625tte.this.EZpvd(editable);
                }
                C47625tte.this.isConnected();
            }
            C47625tte c47625tte = C47625tte.this;
            c47625tte.DbNXlk = c47625tte.EZpvd.KWHzl.getSelectionStart();
        }
    }

    public final void setupTextWatcher() {
        this.EZpvd.KWHzl.addTextChangedListener(new LoaderManager());
    }

    public final void EZpvd(android.text.Editable editable) {
        try {
            OLrzqt(editable);
        } catch (java.lang.Exception unused) {
            this.djBIcL = yDY.AhwBna();
        }
    }

    public final void OLrzqt(android.text.Editable editable) {
        java.lang.Class<C47635tto> cls;
        java.util.Iterator it;
        int i;
        boolean z;
        java.lang.Object next;
        java.util.Iterator it2;
        java.lang.Class<C47635tto> cls2;
        int i2;
        boolean z2;
        java.lang.String string = editable.toString();
        int length = string.length();
        if (string.length() == 0) {
            valueOf(editable);
            this.djBIcL = yDY.AhwBna();
            return;
        }
        java.util.List<java.lang.String> listKWHzl = C46454tUy.OLrzqt.KWHzl(string);
        java.lang.Class<C47635tto> cls3 = C47635tto.class;
        int i3 = 0;
        C47635tto[] c47635ttoArr = (C47635tto[]) editable.getSpans(0, editable.length(), C47635tto.class);
        java.lang.Object[] spans = editable.getSpans(0, editable.length(), C47631ttk.class);
        Intrinsics.checkNotNullExpressionValue(spans, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : spans) {
            if (((C47631ttk) obj).AEQbTJ() == InputHyperlinkType.LINK) {
                arrayList.add(obj);
            }
        }
        int color = getResources().getColor(C52761wXj.Activity.dvKsVJ, getContext().getTheme());
        LinkedHashSet<java.lang.String> linkedHashSet = new LinkedHashSet();
        java.util.Iterator itEZpvd = yHX.EZpvd(c47635ttoArr);
        while (true) {
            java.lang.Object obj2 = null;
            if (!itEZpvd.hasNext()) {
                break;
            }
            C47635tto c47635tto = (C47635tto) itEZpvd.next();
            int spanStart = editable.getSpanStart(c47635tto);
            int spanEnd = editable.getSpanEnd(c47635tto);
            if (spanStart >= 0 && spanEnd > spanStart && spanEnd <= editable.length()) {
                java.lang.String string2 = editable.subSequence(spanStart, spanEnd).toString();
                boolean zContains = listKWHzl.contains(string2);
                if (!listKWHzl.isEmpty()) {
                    java.util.Iterator<T> it3 = listKWHzl.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            it2 = itEZpvd;
                            cls2 = cls3;
                            i2 = 2;
                            z2 = false;
                            break;
                        }
                        it2 = itEZpvd;
                        cls2 = cls3;
                        i2 = 2;
                        if (C59449zhJ.startsWith$default((java.lang.String) it3.next(), string2, false, 2, null)) {
                            z2 = true;
                            break;
                        } else {
                            cls3 = cls2;
                            itEZpvd = it2;
                        }
                    }
                } else {
                    it2 = itEZpvd;
                    cls2 = cls3;
                    z2 = false;
                    i2 = 2;
                }
                java.util.Iterator it4 = listKWHzl.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it4.next();
                    java.util.Iterator it5 = it4;
                    java.lang.String str = (java.lang.String) next2;
                    if (C59449zhJ.startsWith$default(string2, str, false, i2, null) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) string2)) {
                        obj2 = next2;
                        break;
                    } else {
                        it4 = it5;
                        i2 = 2;
                    }
                }
                java.lang.String str2 = (java.lang.String) obj2;
                if (!zContains && !z2 && str2 == null) {
                    editable.removeSpan(c47635tto);
                } else if (str2 != null) {
                    editable.removeSpan(c47635tto);
                    int length2 = str2.length() + spanStart;
                    if (length2 <= editable.length()) {
                        editable.setSpan(new C47635tto(color), spanStart, length2, 33);
                        linkedHashSet.add(str2);
                    }
                }
            } else {
                it2 = itEZpvd;
                cls2 = cls3;
                editable.removeSpan(c47635tto);
            }
            cls3 = cls2;
            itEZpvd = it2;
        }
        java.lang.Class<C47635tto> cls4 = cls3;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            C47631ttk c47631ttk = (C47631ttk) it6.next();
            int spanStart2 = editable.getSpanStart(c47631ttk);
            int spanEnd2 = editable.getSpanEnd(c47631ttk);
            if (spanStart2 >= 0 && spanEnd2 > spanStart2 && spanEnd2 <= editable.length()) {
                java.lang.String string3 = editable.subSequence(spanStart2, spanEnd2).toString();
                boolean zContains2 = listKWHzl.contains(string3);
                if (!listKWHzl.isEmpty()) {
                    java.util.Iterator<T> it7 = listKWHzl.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            i = 2;
                            if (C59449zhJ.startsWith$default((java.lang.String) it7.next(), string3, false, 2, null)) {
                                z = true;
                                break;
                            }
                        } else {
                            i = 2;
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = false;
                    i = 2;
                }
                java.util.Iterator<T> it8 = listKWHzl.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        it = it6;
                        next = null;
                        break;
                    }
                    next = it8.next();
                    it = it6;
                    java.lang.String str3 = (java.lang.String) next;
                    if (C59449zhJ.startsWith$default(string3, str3, false, i, null) && !Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) string3)) {
                        break;
                    } else {
                        it6 = it;
                    }
                }
                java.lang.String str4 = (java.lang.String) next;
                if (!zContains2 && !z && str4 == null) {
                    editable.removeSpan(c47631ttk);
                }
            } else {
                it = it6;
                editable.removeSpan(c47631ttk);
            }
            it6 = it;
        }
        if (this.OLrzqt.isEmpty()) {
            java.util.List<Activity> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) copydefault(editable));
            for (java.lang.String str5 : linkedHashSet) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) string, str5, 0, false, 6, (java.lang.Object) null);
                if (iIndexOf$default >= 0) {
                    listFJNWhG.add(new Activity(str5, InputHyperlinkType.LINK, iIndexOf$default, iIndexOf$default + str5.length(), ""));
                }
            }
            this.djBIcL = listFJNWhG;
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str6 : listKWHzl) {
            int length3 = i3;
            while (true) {
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) string, str6, length3, false, 4, (java.lang.Object) null);
                if (iIndexOf$default2 != -1) {
                    length3 = iIndexOf$default2 + str6.length();
                    if (length3 > length) {
                        length3 = iIndexOf$default2 + 1;
                    } else {
                        if (length3 == length || (length3 < length && CharsKt__CharJVMKt.EZpvd(string.charAt(length3)))) {
                            boolean zContains3 = this.OLrzqt.contains(str6);
                            cls = cls4;
                            C47635tto[] c47635ttoArr2 = (C47635tto[]) editable.getSpans(iIndexOf$default2, length3, cls);
                            if (zContains3) {
                                Intrinsics.copydefault(c47635ttoArr2);
                                if (c47635ttoArr2.length == 0) {
                                    editable.setSpan(new C47635tto(color), iIndexOf$default2, length3, 33);
                                } else {
                                    java.util.Iterator itEZpvd2 = yHX.EZpvd(c47635ttoArr2);
                                    while (itEZpvd2.hasNext()) {
                                        C47635tto c47635tto2 = (C47635tto) itEZpvd2.next();
                                        int spanStart3 = editable.getSpanStart(c47635tto2);
                                        int spanEnd3 = editable.getSpanEnd(c47635tto2);
                                        if (spanStart3 != iIndexOf$default2 || spanEnd3 != length3) {
                                            editable.removeSpan(c47635tto2);
                                            editable.setSpan(new C47635tto(color), iIndexOf$default2, length3, 33);
                                            break;
                                        }
                                    }
                                }
                                arrayList2.add(new Activity(str6, InputHyperlinkType.LINK, iIndexOf$default2, length3, ""));
                            } else if (linkedHashSet.contains(str6)) {
                                arrayList2.add(new Activity(str6, InputHyperlinkType.LINK, iIndexOf$default2, length3, ""));
                            } else {
                                Intrinsics.copydefault(c47635ttoArr2);
                                if (!(c47635ttoArr2.length == 0)) {
                                    arrayList2.add(new Activity(str6, InputHyperlinkType.LINK, iIndexOf$default2, length3, ""));
                                }
                            }
                        } else {
                            cls = cls4;
                        }
                        cls4 = cls;
                        i3 = 0;
                    }
                }
            }
        }
        this.djBIcL = arrayList2;
    }

    public final void valueOf(android.text.Editable editable) {
        java.util.Iterator itEZpvd = yHX.EZpvd((C47631ttk[]) editable.getSpans(0, editable.length(), C47631ttk.class));
        while (itEZpvd.hasNext()) {
            C47631ttk c47631ttk = (C47631ttk) itEZpvd.next();
            if (c47631ttk.AEQbTJ() == InputHyperlinkType.LINK) {
                editable.removeSpan(c47631ttk);
            }
        }
        java.util.Iterator itEZpvd2 = yHX.EZpvd((C47635tto[]) editable.getSpans(0, editable.length(), C47635tto.class));
        while (itEZpvd2.hasNext()) {
            editable.removeSpan((C47635tto) itEZpvd2.next());
        }
    }

    public final java.util.List<Activity> copydefault(android.text.Editable editable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator itEZpvd = yHX.EZpvd((C47635tto[]) editable.getSpans(0, editable.length(), C47635tto.class));
        while (itEZpvd.hasNext()) {
            C47635tto c47635tto = (C47635tto) itEZpvd.next();
            int spanStart = editable.getSpanStart(c47635tto);
            int spanEnd = editable.getSpanEnd(c47635tto);
            if (spanStart >= 0 && spanEnd > spanStart && spanEnd <= editable.length()) {
                arrayList.add(new Activity(editable.subSequence(spanStart, spanEnd).toString(), InputHyperlinkType.LINK, spanStart, spanEnd, ""));
            }
        }
        return arrayList;
    }

    public final void OLrzqt() {
        OKEditText oKEditText = this.EZpvd.KWHzl;
        oKEditText.setHint(this.AEQbTJ.AYXKKw());
        oKEditText.setText(this.AEQbTJ.DbNXlk());
        this.EZpvd.KWHzl.setPadding(this.AEQbTJ.AkhnZx(), this.AEQbTJ.isConnected(), this.AEQbTJ.fetchVPNInfo(), this.AEQbTJ.values());
    }

    public final void KWHzl(android.text.Editable editable) {
        int iValueOf = this.AEQbTJ.valueOf();
        if (iValueOf <= 0 || editable.length() == 0) {
            return;
        }
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.DQzvGN);
        int iCopydefault3 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        java.util.Iterator itEZpvd = yHX.EZpvd((android.text.style.ForegroundColorSpan[]) editable.getSpans(0, editable.length(), android.text.style.ForegroundColorSpan.class));
        while (itEZpvd.hasNext()) {
            editable.removeSpan((android.text.style.ForegroundColorSpan) itEZpvd.next());
        }
        int iMin = java.lang.Math.min(iValueOf, editable.length());
        if (iMin > 0) {
            editable.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, iMin, 33);
        }
        if (editable.length() > iValueOf) {
            editable.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault2), iValueOf, editable.length(), 33);
        }
        java.util.Iterator itEZpvd2 = yHX.EZpvd((C47631ttk[]) editable.getSpans(0, editable.length(), C47631ttk.class));
        while (itEZpvd2.hasNext()) {
            C47631ttk c47631ttk = (C47631ttk) itEZpvd2.next();
            int spanStart = editable.getSpanStart(c47631ttk);
            int spanEnd = editable.getSpanEnd(c47631ttk);
            java.lang.Object c47631ttk2 = new C47631ttk(c47631ttk.EZpvd(), spanEnd <= iValueOf ? iCopydefault3 : iCopydefault2, c47631ttk.KWHzl(), c47631ttk.AEQbTJ(), c47631ttk.OLrzqt());
            editable.removeSpan(c47631ttk);
            editable.setSpan(c47631ttk2, spanStart, spanEnd, 33);
        }
    }

    public final void AEQbTJ(android.text.Editable editable) {
        java.lang.String string;
        int iValueOf = this.AEQbTJ.valueOf();
        boolean z = iValueOf > 0 && (this.values.length() > iValueOf || editable.length() > iValueOf);
        OKEditText oKEditText = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        int selectionStart = oKEditText.getSelectionStart();
        int selectionEnd = oKEditText.getSelectionEnd();
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.DQzvGN);
        int iCopydefault3 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        java.util.ArrayList<Dialog> arrayList = new java.util.ArrayList();
        C47631ttk[] c47631ttkArr = (C47631ttk[]) editable.getSpans(0, editable.length(), C47631ttk.class);
        java.util.Iterator itEZpvd = yHX.EZpvd(c47631ttkArr);
        while (itEZpvd.hasNext()) {
            C47631ttk c47631ttk = (C47631ttk) itEZpvd.next();
            int spanStart = editable.getSpanStart(c47631ttk);
            int spanEnd = editable.getSpanEnd(c47631ttk);
            if (spanEnd <= editable.length()) {
                string = editable.subSequence(spanStart, spanEnd).toString();
            } else {
                string = editable.subSequence(spanStart, editable.length()).toString();
            }
            arrayList.add(new Dialog(spanStart, spanEnd, string, c47631ttk.KWHzl(), c47631ttk.AEQbTJ(), c47631ttk.OLrzqt()));
        }
        java.util.Iterator itEZpvd2 = yHX.EZpvd((android.text.style.ForegroundColorSpan[]) editable.getSpans(0, editable.length(), android.text.style.ForegroundColorSpan.class));
        while (itEZpvd2.hasNext()) {
            editable.removeSpan((android.text.style.ForegroundColorSpan) itEZpvd2.next());
        }
        java.util.Iterator itEZpvd3 = yHX.EZpvd(c47631ttkArr);
        while (itEZpvd3.hasNext()) {
            editable.removeSpan((C47631ttk) itEZpvd3.next());
        }
        if (z) {
            if (editable.length() > 0) {
                editable.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, java.lang.Math.min(iValueOf, editable.length()), 33);
            }
            if (editable.length() > iValueOf) {
                editable.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault2), iValueOf, editable.length(), 33);
            }
        }
        for (Dialog dialog : arrayList) {
            editable.setSpan(new C47631ttk(dialog.AEQbTJ(), (!z || dialog.EZpvd() <= iValueOf) ? iCopydefault3 : iCopydefault2, dialog.OLrzqt(), dialog.AhwBna(), dialog.copydefault()), dialog.KWHzl(), dialog.EZpvd(), 33);
        }
        if (selectionStart < 0 || selectionEnd < 0) {
            return;
        }
        int length = editable.length();
        oKEditText.setSelection(java.lang.Math.min(selectionStart, length), java.lang.Math.min(selectionEnd, length));
    }

    /* JADX INFO: renamed from: o.tte$Dialog */
    public static final class Dialog {
        public final java.lang.String AEQbTJ;
        public final InputHyperlinkType AYXKKw;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, int i, int i2, java.lang.String str, java.lang.String str2, InputHyperlinkType inputHyperlinkType, java.lang.String str3, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = dialog.copydefault;
            }
            if ((i3 & 2) != 0) {
                i2 = dialog.OLrzqt;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                str = dialog.EZpvd;
            }
            java.lang.String str4 = str;
            if ((i3 & 8) != 0) {
                str2 = dialog.KWHzl;
            }
            java.lang.String str5 = str2;
            if ((i3 & 16) != 0) {
                inputHyperlinkType = dialog.AYXKKw;
            }
            InputHyperlinkType inputHyperlinkType2 = inputHyperlinkType;
            if ((i3 & 32) != 0) {
                str3 = dialog.AEQbTJ;
            }
            return dialog.OLrzqt(i, i4, str4, str5, inputHyperlinkType2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InputHyperlinkType AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog OLrzqt(int i, int i2, java.lang.String str, java.lang.String str2, InputHyperlinkType inputHyperlinkType, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Dialog(i, i2, str, str2, inputHyperlinkType, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return this.copydefault == dialog.copydefault && this.OLrzqt == dialog.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dialog.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dialog.KWHzl) && this.AYXKKw == dialog.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) dialog.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HyperlinkInfo(start=" + this.copydefault + ", end=" + this.OLrzqt + ", text=" + this.EZpvd + ", symbol=" + this.KWHzl + ", type=" + this.AYXKKw + ", activityKey=" + this.AEQbTJ + ")";
        }

        public Dialog(int i, int i2, java.lang.String str, java.lang.String str2, InputHyperlinkType inputHyperlinkType, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(inputHyperlinkType, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = i;
            this.OLrzqt = i2;
            this.EZpvd = str;
            this.KWHzl = str2;
            this.AYXKKw = inputHyperlinkType;
            this.AEQbTJ = str3;
        }
    }

    public final void DbNXlk() {
        android.text.Editable text;
        android.text.Editable text2;
        java.lang.String strValues = values();
        int length = strValues.length();
        int iValueOf = this.AEQbTJ.valueOf();
        FragmentManager fragmentManager = this.fetchVPNInfo;
        if (fragmentManager != null) {
            fragmentManager.copydefault(strValues, length, iValueOf);
        }
        if (iValueOf > 0 && strValues.length() > 0 && (text2 = this.EZpvd.KWHzl.getText()) != null) {
            AEQbTJ(text2);
        }
        if (!this.AEQbTJ.gEmmrt() || strValues.length() <= 0 || (text = this.EZpvd.KWHzl.getText()) == null) {
            return;
        }
        EZpvd(text);
    }

    public final void EZpvd(java.lang.String str, int i) {
        java.lang.Character chAhwBna;
        StateListAnimator stateListAnimator;
        if (i > 0 && (chAhwBna = C59454zhO.AhwBna((java.lang.CharSequence) str, i - 1)) != null) {
            char cCharValue = chAhwBna.charValue();
            if (yEE.AhwBna('$', '#').contains(java.lang.Character.valueOf(cCharValue))) {
                StateListAnimator stateListAnimator2 = this.valueOf;
                if (stateListAnimator2 != null) {
                    stateListAnimator2.copydefault(java.lang.String.valueOf(cCharValue), i);
                    return;
                }
                return;
            }
            if (!this.AhwBna || java.lang.Character.isLetterOrDigit(cCharValue) || (stateListAnimator = this.valueOf) == null) {
                return;
            }
            stateListAnimator.AEQbTJ(java.lang.String.valueOf(cCharValue));
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (i >= str.length()) {
            return;
        }
        java.lang.String strSubstring = str.substring(i, java.lang.Math.min(i2 + i, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.util.Iterator it = yEE.AhwBna('$', '#').iterator();
        while (it.hasNext()) {
            char cCharValue = ((java.lang.Character) it.next()).charValue();
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strSubstring, cCharValue, false, 2, (java.lang.Object) null)) {
                StateListAnimator stateListAnimator = this.valueOf;
                if (stateListAnimator != null) {
                    stateListAnimator.OLrzqt(java.lang.String.valueOf(cCharValue));
                    return;
                }
                return;
            }
        }
    }

    public final void EZpvd() {
        android.text.Editable text = this.EZpvd.KWHzl.getText();
        if (text == null) {
            return;
        }
        java.util.Iterator itEZpvd = yHX.EZpvd((C47631ttk[]) text.getSpans(0, text.length(), C47631ttk.class));
        while (itEZpvd.hasNext()) {
            C47631ttk c47631ttk = (C47631ttk) itEZpvd.next();
            int spanStart = text.getSpanStart(c47631ttk);
            int spanEnd = text.getSpanEnd(c47631ttk);
            if (spanStart >= 0 && spanEnd <= text.length() && spanStart < spanEnd && !Intrinsics.EZpvd((java.lang.Object) text.subSequence(spanStart, spanEnd).toString(), (java.lang.Object) c47631ttk.EZpvd())) {
                text.removeSpan(c47631ttk);
                text.delete(spanStart, spanEnd);
                this.EZpvd.KWHzl.setSelection(spanStart);
                isConnected();
                return;
            }
        }
    }

    public final void setupCursorPositionListener() {
        this.EZpvd.KWHzl.setOnTouchListener(new View.OnTouchListener() { // from class: o.ttm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C47625tte.EZpvd(this.KWHzl, view, motionEvent);
            }
        });
    }

    public static final boolean EZpvd(final C47625tte c47625tte, android.view.View view, android.view.MotionEvent motionEvent) {
        c47625tte.EZpvd.KWHzl.post(new java.lang.Runnable() { // from class: o.ttf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47625tte.fetchVPNInfo(this.KWHzl);
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchVPNInfo(C47625tte c47625tte) {
        TaskDescription taskDescription;
        int selectionStart = c47625tte.EZpvd.KWHzl.getSelectionStart();
        if (c47625tte.AhwBna) {
            if (selectionStart != c47625tte.DbNXlk && c47625tte.OLrzqt(selectionStart) && (taskDescription = c47625tte.KWHzl) != null) {
                taskDescription.EZpvd();
            }
        } else {
            TaskDescription taskDescription2 = c47625tte.KWHzl;
            if (taskDescription2 != null) {
                taskDescription2.EZpvd();
            }
        }
        if (selectionStart != c47625tte.DbNXlk) {
            c47625tte.DbNXlk = selectionStart;
        }
    }

    public final int djBIcL() {
        java.lang.String strValues = values();
        int iAhwBna = AhwBna();
        if (iAhwBna <= 0) {
            return -1;
        }
        for (int i = iAhwBna - 1; -1 < i; i--) {
            java.lang.Character chAhwBna = C59454zhO.AhwBna((java.lang.CharSequence) strValues, i);
            if ((chAhwBna != null && chAhwBna.charValue() == '$') || (chAhwBna != null && chAhwBna.charValue() == '#')) {
                return i;
            }
        }
        return -1;
    }

    public final boolean OLrzqt(int i) {
        if (this.AkhnZx == -1) {
            return false;
        }
        java.lang.String strValues = values();
        int i2 = this.AkhnZx;
        if (i <= i2) {
            return true;
        }
        int iCopydefault = copydefault(strValues, i2);
        return iCopydefault != -1 && i > iCopydefault;
    }

    public final int copydefault(java.lang.String str, int i) {
        int length = str.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (!java.lang.Character.isLetterOrDigit(str.charAt(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public final void setupImageReceiveContentListener() {
        ViewCompat.setOnReceiveContentListener(this.EZpvd.KWHzl, new java.lang.String[]{"image/*"}, new OnReceiveContentListener() { // from class: o.ttl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnReceiveContentListener
            public final ContentInfoCompat onReceiveContent(android.view.View view, ContentInfoCompat contentInfoCompat) {
                return C47625tte.OLrzqt(this.OLrzqt, view, contentInfoCompat);
            }
        });
    }

    public static final ContentInfoCompat OLrzqt(C47625tte c47625tte, android.view.View view, ContentInfoCompat contentInfoCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(contentInfoCompat, "");
        android.content.ClipData clip = contentInfoCompat.getClip();
        Intrinsics.checkNotNullExpressionValue(clip, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int itemCount = clip.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            android.net.Uri uri = clip.getItemAt(i).getUri();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return contentInfoCompat;
        }
        ActionBar actionBar = c47625tte.AYXKKw;
        if (actionBar == null) {
            return null;
        }
        actionBar.AEQbTJ(arrayList);
        return null;
    }
}
