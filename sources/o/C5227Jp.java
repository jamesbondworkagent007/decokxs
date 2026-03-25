package o;

import com.amplitude.android.internal.ViewTarget;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5227Jp implements InterfaceC5234Jw {
    public static final ActionBar Companion = new ActionBar(null);
    public final int[] EZpvd = new int[2];

    /* JADX INFO: renamed from: o.Jp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Jp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC5234Jw
    public ViewTarget copydefault(@NotNull java.lang.Object obj, @NotNull kotlin.Pair<java.lang.Float, java.lang.Float> pair, @NotNull ViewTarget.Type type) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(type, "");
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null) {
            return null;
        }
        android.view.View view2 = (android.view.View) obj;
        if (!KWHzl(view2, pair) || type != ViewTarget.Type.Clickable || !EZpvd(view2)) {
            view = null;
        }
        if (view != null) {
            return copydefault(view2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewTarget copydefault(android.view.View view) {
        java.lang.String string;
        java.lang.CharSequence text;
        java.lang.String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        java.lang.String str = canonicalName;
        java.lang.String strAEQbTJ = C5222Jk.KWHzl.AEQbTJ(view);
        java.lang.String strAEQbTJ2 = AEQbTJ(view);
        java.lang.Object tag = view.getTag();
        if (tag == null) {
            string = null;
        } else {
            if (!(tag instanceof java.lang.String) && !(tag instanceof java.lang.Number) && !(tag instanceof java.lang.Boolean) && !(tag instanceof java.lang.Character)) {
                tag = null;
            }
            if (tag != null) {
                string = tag.toString();
            }
        }
        android.widget.Button button = view instanceof android.widget.Button ? (android.widget.Button) view : null;
        return new ViewTarget(view, str, strAEQbTJ, string, (button == null || (text = button.getText()) == null) ? null : text.toString(), "android_view", strAEQbTJ2);
    }

    public final boolean KWHzl(android.view.View view, kotlin.Pair<java.lang.Float, java.lang.Float> pair) {
        float fFloatValue = pair.component1().floatValue();
        float fFloatValue2 = pair.component2().floatValue();
        view.getLocationOnScreen(this.EZpvd);
        int[] iArr = this.EZpvd;
        int i = iArr[0];
        int i2 = iArr[1];
        return fFloatValue >= ((float) i) && fFloatValue <= ((float) (i + view.getWidth())) && fFloatValue2 >= ((float) i2) && fFloatValue2 <= ((float) (i2 + view.getHeight()));
    }

    public final boolean EZpvd(android.view.View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    public final java.lang.String AEQbTJ(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (view != null) {
            java.lang.String simpleName = view.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            arrayList.add(simpleName);
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, " → ", null, null, 0, null, null, 62, null);
    }
}
