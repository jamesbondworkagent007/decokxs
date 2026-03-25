package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.okinc.lifecycle.impl.serviceImpl.LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1;
import com.okinc.lifecycle.impl.serviceImpl.LifecycleLinkServiceAbs$processLink$1;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.lang.ref.WeakReference;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pOt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC38168pOt extends AbstractC43215rlA implements pKD {
    public static final ActionBar Companion = new ActionBar(null);

    public abstract java.lang.String EZpvd();

    /* JADX INFO: renamed from: o.pOt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pOt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.pKD
    public void EZpvd(@NotNull AppCompatActivity appCompatActivity, @NotNull java.lang.String str, @NotNull LinkSource linkSource) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        EZpvd(appCompatActivity);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new LifecycleLinkServiceAbs$processLink$1(this, appCompatActivity, str, linkSource, null), 3, null);
    }

    public final void EZpvd(AppCompatActivity appCompatActivity) {
        if (OLrzqt(appCompatActivity)) {
            return;
        }
        appCompatActivity.startActivity(appCompatActivity.getPackageManager().getLaunchIntentForPackage(appCompatActivity.getPackageName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e0 -> B:36:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(AppCompatActivity appCompatActivity, Continuation<? super FragmentActivity> continuation) throws java.lang.Throwable {
        LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1 lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1;
        AbstractC38168pOt abstractC38168pOt;
        AbstractC38168pOt abstractC38168pOt2;
        int i;
        int i2;
        AppCompatActivity appCompatActivity2;
        java.lang.Object obj;
        if (continuation instanceof LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1) {
            lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1 = (LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1) continuation;
            int i3 = lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.label = i3 - Integer.MIN_VALUE;
                abstractC38168pOt = this;
            } else {
                abstractC38168pOt = this;
                lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1 = new LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1(abstractC38168pOt, continuation);
            }
        }
        java.lang.Object obj2 = lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj2);
            abstractC38168pOt2 = abstractC38168pOt;
            i = 100;
            i2 = 0;
            appCompatActivity2 = appCompatActivity;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.I$1;
            i = lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.I$0;
            AppCompatActivity appCompatActivity3 = (AppCompatActivity) lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.L$1;
            abstractC38168pOt2 = (AbstractC38168pOt) lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            appCompatActivity2 = appCompatActivity3;
            i2++;
            if (i2 < i) {
                java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C32979mnm.EZpvd.KWHzl());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = listAxsJAYsNCnLh.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object obj3 = ((WeakReference) it.next()).get();
                    obj = obj3 instanceof FragmentActivity ? (FragmentActivity) obj3 : null;
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
                    pUU.EZpvd(abstractC38168pOt2.EZpvd(), "Attempt " + i2 + " → " + ((FragmentActivity) next).getClass().getSimpleName());
                    if (!abstractC38168pOt2.copydefault(r10)) {
                        obj = next;
                        break;
                    }
                }
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                if (fragmentActivity != null) {
                    return fragmentActivity;
                }
                lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.L$0 = abstractC38168pOt2;
                lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.L$1 = appCompatActivity2;
                lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.I$0 = i;
                lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.I$1 = i2;
                lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1.label = 1;
                if (DelayKt.delay(100L, lifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1) == objCopydefault) {
                    return objCopydefault;
                }
                i2++;
                if (i2 < i) {
                    return appCompatActivity2;
                }
            }
        }
    }

    public final boolean OLrzqt(FragmentActivity fragmentActivity) {
        java.lang.Object obj;
        pUU.EZpvd(EZpvd(), "Checking against activity " + fragmentActivity.getClass().getSimpleName());
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C32979mnm.EZpvd.KWHzl());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listAxsJAYsNCnLh.iterator();
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
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            if (!copydefault(fragmentActivity)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    public final boolean copydefault(android.content.Context context) {
        java.lang.String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        if (!C59449zhJ.endsWith$default(simpleName, "SchemeActivity", false, 2, null)) {
            java.lang.String simpleName2 = context.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "");
            if (!C59449zhJ.endsWith$default(simpleName2, "WelcomeActivity", false, 2, null)) {
                return false;
            }
        }
        return true;
    }
}
