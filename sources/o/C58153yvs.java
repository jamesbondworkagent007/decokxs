package o;

import com.trello.rxlifecycle2.OutsideLifecycleException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.yvs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58153yvs {
    public static final InterfaceC58229yxO<java.lang.Throwable, java.lang.Boolean> EZpvd = new InterfaceC58229yxO<java.lang.Throwable, java.lang.Boolean>() { // from class: o.yvs.5
        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC58229yxO
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean apply(java.lang.Throwable th) throws java.lang.Exception {
            if (th instanceof OutsideLifecycleException) {
                return java.lang.Boolean.TRUE;
            }
            C58218yxD.OLrzqt(th);
            return java.lang.Boolean.FALSE;
        }
    };
    public static final InterfaceC58239yxY<java.lang.Boolean> copydefault = new InterfaceC58239yxY<java.lang.Boolean>() { // from class: o.yvs.3
        /* JADX DEBUG: Method merged with bridge method: test(Ljava/lang/Object;)Z */
        @Override // o.InterfaceC58239yxY
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean test(java.lang.Boolean bool) throws java.lang.Exception {
            return bool.booleanValue();
        }
    };
    public static final InterfaceC58229yxO<java.lang.Object, AbstractC58177ywP> OLrzqt = new InterfaceC58229yxO<java.lang.Object, AbstractC58177ywP>() { // from class: o.yvs.2
        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC58229yxO
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public AbstractC58177ywP apply(java.lang.Object obj) throws java.lang.Exception {
            return AbstractC58177ywP.EZpvd(new CancellationException());
        }
    };

    private C58153yvs() {
        throw new java.lang.AssertionError("No instances!");
    }
}
