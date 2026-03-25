package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10228bkW extends C43316rmw {
    public final AsyncListDiffer<C10303bls> OLrzqt;
    public final ActionBar copydefault;

    public C10228bkW(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, java.lang.String> function1, @NotNull final Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2, @NotNull Function1<? super C10303bls, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        register(C10303bls.class, new C10300blp(str, function1, function12, new Function1() { // from class: o.blb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10228bkW.KWHzl(this.KWHzl, (C10303bls) obj));
            }
        }, new Function2() { // from class: o.ble
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10228bkW.OLrzqt(function2, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }));
        ActionBar actionBar = new ActionBar();
        this.copydefault = actionBar;
        this.OLrzqt = new AsyncListDiffer<>(this, actionBar);
    }

    public static final boolean KWHzl(C10228bkW c10228bkW, C10303bls c10303bls) {
        Intrinsics.checkNotNullParameter(c10303bls, "");
        java.util.List<C10303bls> currentList = c10228bkW.OLrzqt.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        C10303bls c10303bls2 = (C10303bls) CollectionsKt___CollectionsKt.wlaJM(currentList);
        return Intrinsics.EZpvd((java.lang.Object) (c10303bls2 != null ? c10303bls2.copydefault() : null), (java.lang.Object) c10303bls.copydefault());
    }

    public static final Unit OLrzqt(Function2 function2, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        function2.invoke(str, java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.bkW$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<C10303bls> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C10303bls c10303bls, C10303bls c10303bls2) {
            Intrinsics.checkNotNullParameter(c10303bls, "");
            Intrinsics.checkNotNullParameter(c10303bls2, "");
            return Intrinsics.EZpvd((java.lang.Object) c10303bls.copydefault(), (java.lang.Object) c10303bls2.copydefault());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C10303bls c10303bls, C10303bls c10303bls2) {
            Intrinsics.checkNotNullParameter(c10303bls, "");
            Intrinsics.checkNotNullParameter(c10303bls2, "");
            return Intrinsics.EZpvd(c10303bls, c10303bls2);
        }
    }

    public final void copydefault(@NotNull java.util.List<C10303bls> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.submitList(list, new java.lang.Runnable() { // from class: o.bld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C10228bkW.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(C10228bkW c10228bkW) {
        super.setItems(c10228bkW.OLrzqt.getCurrentList());
    }
}
