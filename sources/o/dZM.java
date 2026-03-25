package o;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class dZM {

    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ Function1<androidx.fragment.app.Fragment, java.lang.Boolean> OLrzqt;

        public static final class Application implements Function1<androidx.fragment.app.Fragment, androidx.fragment.app.Fragment> {
            public static final Application EZpvd = new Application();

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final androidx.fragment.app.Fragment invoke(androidx.fragment.app.Fragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "");
                return fragment.getParentFragment();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            Sequence sequenceEZpvd = C59405zgS.EZpvd(this.KWHzl.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) Application.EZpvd));
            Function1<androidx.fragment.app.Fragment, java.lang.Boolean> function1 = this.OLrzqt;
            java.util.Iterator it = sequenceEZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (function1.invoke((androidx.fragment.app.Fragment) next).booleanValue()) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(ViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.KWHzl.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }
}
