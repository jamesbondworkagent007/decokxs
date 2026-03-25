package o;

import com.tinder.scarlet.lifecycle.FlowableLifecycle$combineWith$flowable$1;
import com.tinder.scarlet.lifecycle.FlowableLifecycle$combineWith$flowable$2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58028ytZ;
import o.yBO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58064yuI implements InterfaceC58028ytZ {
    public final AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator> AEQbTJ;
    public final AbstractC58253yxm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.AEQbTJ.subscribe(interfaceC60097zve);
    }

    public C58064yuI(@NotNull AbstractC58185ywX<InterfaceC58028ytZ.StateListAnimator> abstractC58185ywX, @NotNull AbstractC58253yxm abstractC58253yxm) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
        this.AEQbTJ = abstractC58185ywX;
        this.copydefault = abstractC58253yxm;
    }

    public InterfaceC58028ytZ OLrzqt(@NotNull InterfaceC58028ytZ... interfaceC58028ytZArr) {
        Intrinsics.checkNotNullParameter(interfaceC58028ytZArr, "");
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.util.Collection) C56402yEa.EZpvd(this), (java.lang.Object[]) interfaceC58028ytZArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC58185ywX.copydefault((InterfaceC58028ytZ) it.next()).AEQbTJ(this.copydefault));
        }
        final FlowableLifecycle$combineWith$flowable$1 flowableLifecycle$combineWith$flowable$1 = new Function1<java.lang.Object[], java.util.List<? extends yBO<InterfaceC58028ytZ.StateListAnimator>>>() { // from class: com.tinder.scarlet.lifecycle.FlowableLifecycle$combineWith$flowable$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final List<yBO<InterfaceC58028ytZ.StateListAnimator>> invoke(@NotNull Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "");
                ArrayList arrayList2 = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    Intrinsics.copydefault(obj, "");
                    arrayList2.add((yBO) obj);
                }
                return arrayList2;
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd((java.lang.Iterable) arrayList, new InterfaceC58229yxO() { // from class: o.yuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C58064yuI.OLrzqt(flowableLifecycle$combineWith$flowable$1, obj);
            }
        });
        final FlowableLifecycle$combineWith$flowable$2 flowableLifecycle$combineWith$flowable$2 = FlowableLifecycle$combineWith$flowable$2.INSTANCE;
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.yuO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C58064yuI.EZpvd(flowableLifecycle$combineWith$flowable$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return new C58064yuI(abstractC58185ywXAEQbTJ, this.copydefault);
    }

    public static final java.util.List OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final InterfaceC58028ytZ.StateListAnimator EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        return (InterfaceC58028ytZ.StateListAnimator) function1.invoke(obj);
    }
}
