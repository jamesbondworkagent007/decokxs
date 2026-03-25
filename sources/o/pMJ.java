package o;

import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMJ implements pMM {
    public android.content.Context copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pMM
    public void KWHzl() {
        this.copydefault = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pMM
    public android.content.Context OLrzqt() {
        return this.copydefault;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.pMM
    public void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof android.app.Activity) {
            this.copydefault = context;
            return;
        }
        pUU.valueOf("ContextWrapperImpl", "setContext called with non-Activity context: " + context.getClass().getSimpleName());
        this.copydefault = null;
    }

    @Override // o.pMM
    public android.content.Context copydefault() {
        android.content.Context context = this.copydefault;
        if (context instanceof android.app.Activity) {
            Intrinsics.copydefault(context);
            if (!AEQbTJ(context)) {
                return this.copydefault;
            }
        }
        android.content.Context contextEZpvd = EZpvd();
        return contextEZpvd == null ? C54819xWm.KWHzl().AEQbTJ() : contextEZpvd;
    }

    public final android.content.Context EZpvd() {
        java.lang.Object obj;
        java.util.List<WeakReference<android.app.Activity>> listKWHzl = C32979mnm.EZpvd.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object obj2 = ((WeakReference) it.next()).get();
            obj = obj2 instanceof FragmentActivity ? (FragmentActivity) obj2 : null;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        C56404yEc.zsXlph(listFJNWhG);
        java.util.Iterator it2 = listFJNWhG.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            java.lang.String simpleName = ((FragmentActivity) next).getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            pUU.EZpvd("BaseLinkProcessor", simpleName);
            if (!AEQbTJ(r2)) {
                obj = next;
                break;
            }
        }
        return (android.content.Context) obj;
    }

    public final boolean AEQbTJ(android.content.Context context) {
        java.lang.String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        if (!C59449zhJ.endsWith$default(simpleName, "SchemeActivity", false, 2, null)) {
            java.lang.String simpleName2 = context.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "");
            if (!C59449zhJ.endsWith$default(simpleName2, "WelcomeActivity", false, 2, null)) {
                java.lang.String simpleName3 = context.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName3, "");
                if (!C59449zhJ.endsWith$default(simpleName3, "ModeSwitchActivity", false, 2, null)) {
                    return false;
                }
            }
        }
        return true;
    }
}
