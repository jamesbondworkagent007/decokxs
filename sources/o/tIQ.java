package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C46139tJg;

/* JADX INFO: loaded from: classes24.dex */
public final class tIQ extends C47506trQ {
    public tIQ() {
        super(new DiffUtil.ItemCallback<InterfaceC47500trK>() { // from class: o.tIQ.2
            /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(InterfaceC47500trK interfaceC47500trK, InterfaceC47500trK interfaceC47500trK2) {
                Intrinsics.checkNotNullParameter(interfaceC47500trK, "");
                Intrinsics.checkNotNullParameter(interfaceC47500trK2, "");
                if ((interfaceC47500trK instanceof C46139tJg) && (interfaceC47500trK2 instanceof C46139tJg)) {
                    C46139tJg c46139tJg = (C46139tJg) interfaceC47500trK;
                    C46139tJg c46139tJg2 = (C46139tJg) interfaceC47500trK2;
                    if (Intrinsics.EZpvd((java.lang.Object) c46139tJg.sSMYrx(), (java.lang.Object) c46139tJg2.sSMYrx()) && Intrinsics.EZpvd((java.lang.Object) c46139tJg.fIwbmz(), (java.lang.Object) c46139tJg2.fIwbmz())) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(InterfaceC47500trK interfaceC47500trK, InterfaceC47500trK interfaceC47500trK2) {
                Intrinsics.checkNotNullParameter(interfaceC47500trK, "");
                Intrinsics.checkNotNullParameter(interfaceC47500trK2, "");
                return (interfaceC47500trK instanceof C46139tJg) && (interfaceC47500trK2 instanceof C46139tJg) && Intrinsics.EZpvd(interfaceC47500trK, interfaceC47500trK2);
            }

            /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public C46139tJg.TaskDescription getChangePayload(InterfaceC47500trK interfaceC47500trK, InterfaceC47500trK interfaceC47500trK2) {
                Intrinsics.checkNotNullParameter(interfaceC47500trK, "");
                Intrinsics.checkNotNullParameter(interfaceC47500trK2, "");
                if ((interfaceC47500trK instanceof C46139tJg) && (interfaceC47500trK2 instanceof C46139tJg)) {
                    return C46139tJg.Companion.EZpvd((C46139tJg) interfaceC47500trK, (C46139tJg) interfaceC47500trK2);
                }
                return null;
            }
        });
    }
}
