package o;

import android.view.View;
import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18956fsG {
    public static final void OLrzqt(@NotNull C19258fxr c19258fxr, @NotNull android.content.Context context, @NotNull java.util.List<TagWrapper> list, @NotNull Function1<? super TagEventProperty, Unit> function1) {
        C18985fsj c18985fsj;
        Intrinsics.checkNotNullParameter(c19258fxr, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        c19258fxr.setVisibility(8);
        TagWrapper tagWrapper = (TagWrapper) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tagWrapper == null || (c18985fsj = (C18985fsj) CollectionsKt___CollectionsKt.firstOrNull(C18985fsj.Companion.EZpvd(C56402yEa.EZpvd(tagWrapper), true, context))) == null) {
            return;
        }
        c19258fxr.OLrzqt(c18985fsj);
        c19258fxr.setOnClickListener(new ActionBar(c19258fxr, 1000L, function1, tagWrapper));
        c19258fxr.setVisibility(0);
    }

    public static final void EZpvd(@NotNull TagEventProperty tagEventProperty, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(tagEventProperty, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) tagEventProperty.OLrzqt())) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, tagEventProperty.OLrzqt(), null, new Function1() { // from class: o.fsE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18956fsG.copydefault((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) tagEventProperty.KWHzl())) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, tagEventProperty.KWHzl(), null, new Function1() { // from class: o.fsI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18956fsG.AEQbTJ((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final java.util.List<C18985fsj> KWHzl(@NotNull android.content.Context context, @NotNull java.util.List<TagWrapper> list, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<TagWrapper> listComponent1 = EZpvd(list).component1();
        int i = z ? 4 : 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (num != null && num.intValue() == 4) {
            arrayList.add(0, C18985fsj.Companion.copydefault(context, C52761wXj.TaskDescription.zNQIcI, java.lang.Integer.valueOf(C52761wXj.Activity.DQzvGN), C13754dXa.FragmentManager.OCdtug));
        }
        arrayList.addAll(C18985fsj.Companion.EZpvd(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listComponent1, i), false, context));
        return arrayList;
    }

    public static final kotlin.Pair<java.util.List<TagWrapper>, java.util.List<TagWrapper>> EZpvd(@NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!C18957fsH.KWHzl.EZpvd().contains(((TagWrapper) obj).KWHzl())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new kotlin.Pair<>(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: o.fsG$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ TagWrapper AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function1 function1, TagWrapper tagWrapper) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = function1;
            this.AEQbTJ = tagWrapper;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt;
                TagEventProperty tagEventPropertyOLrzqt = this.AEQbTJ.OLrzqt();
                if (tagEventPropertyOLrzqt == null) {
                    return;
                }
                function1.invoke(tagEventPropertyOLrzqt);
            }
        }
    }
}
