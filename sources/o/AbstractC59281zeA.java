package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$prepareType$1;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59281zeA extends AbstractC59260zdg {
    public final AbstractC59242zdO EZpvd(AbstractC59242zdO abstractC59242zdO) {
        AbstractC59233zdF abstractC59233zdFOLrzqt;
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59242zdO.djBIcL();
        C59228zdA c59228zdAEZpvd = null;
        abstractC59331zeyAkhnZx = null;
        AbstractC59331zey abstractC59331zeyAkhnZx = null;
        if (interfaceC59315zeiDjBIcL instanceof yYV) {
            yYV yyv = (yYV) interfaceC59315zeiDjBIcL;
            InterfaceC59317zek interfaceC59317zekAEQbTJ = yyv.AEQbTJ();
            if (interfaceC59317zekAEQbTJ.EZpvd() != Variance.IN_VARIANCE) {
                interfaceC59317zekAEQbTJ = null;
            }
            if (interfaceC59317zekAEQbTJ != null && (abstractC59233zdFOLrzqt = interfaceC59317zekAEQbTJ.OLrzqt()) != null) {
                abstractC59331zeyAkhnZx = abstractC59233zdFOLrzqt.AkhnZx();
            }
            AbstractC59331zey abstractC59331zey = abstractC59331zeyAkhnZx;
            if (yyv.djBIcL() == null) {
                InterfaceC59317zek interfaceC59317zekAEQbTJ2 = yyv.AEQbTJ();
                java.util.Collection<AbstractC59233zdF> collectionBV_ = yyv.bV_();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collectionBV_, 10));
                java.util.Iterator<T> it = collectionBV_.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC59233zdF) it.next()).AkhnZx());
                }
                yyv.AEQbTJ(new C59285zeE(interfaceC59317zekAEQbTJ2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            C59285zeE c59285zeEDjBIcL = yyv.djBIcL();
            Intrinsics.copydefault(c59285zeEDjBIcL);
            return new C59288zeH(captureStatus, c59285zeEDjBIcL, abstractC59331zey, abstractC59242zdO.bX_(), abstractC59242zdO.AEQbTJ(), false, 32, null);
        }
        boolean z = false;
        if (interfaceC59315zeiDjBIcL instanceof C56985yZq) {
            java.util.Collection<AbstractC59233zdF> collectionBV_2 = ((C56985yZq) interfaceC59315zeiDjBIcL).bV_();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(collectionBV_2, 10));
            java.util.Iterator<T> it2 = collectionBV_2.iterator();
            while (it2.hasNext()) {
                AbstractC59233zdF abstractC59233zdFEZpvd = C59322zep.EZpvd((AbstractC59233zdF) it2.next(), abstractC59242zdO.AEQbTJ());
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFEZpvd, "");
                arrayList2.add(abstractC59233zdFEZpvd);
            }
            return C59231zdD.OLrzqt(abstractC59242zdO.bX_(), new C59228zdA(arrayList2), yDY.AhwBna(), false, abstractC59242zdO.OLrzqt());
        }
        if (!(interfaceC59315zeiDjBIcL instanceof C59228zdA) || !abstractC59242zdO.AEQbTJ()) {
            return abstractC59242zdO;
        }
        C59228zdA c59228zdA = (C59228zdA) interfaceC59315zeiDjBIcL;
        java.util.Collection<AbstractC59233zdF> collectionBV_3 = c59228zdA.bV_();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(collectionBV_3, 10));
        java.util.Iterator<T> it3 = collectionBV_3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C59336zfC.AkhnZx((AbstractC59233zdF) it3.next()));
            z = true;
        }
        if (z) {
            AbstractC59233zdF abstractC59233zdFAhwBna = c59228zdA.AhwBna();
            c59228zdAEZpvd = new C59228zdA(arrayList3).EZpvd(abstractC59233zdFAhwBna != null ? C59336zfC.AkhnZx(abstractC59233zdFAhwBna) : null);
        }
        if (c59228zdAEZpvd != null) {
            c59228zdA = c59228zdAEZpvd;
        }
        return c59228zdA.AYXKKw();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zfw;)Lo/zfw; */
    @Override // o.AbstractC59260zdg
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public AbstractC59331zey KWHzl(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        AbstractC59331zey abstractC59331zeyCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        if (!(interfaceC59382zfw instanceof AbstractC59233zdF)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        AbstractC59331zey abstractC59331zeyAkhnZx = ((AbstractC59233zdF) interfaceC59382zfw).AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof AbstractC59242zdO) {
            abstractC59331zeyCopydefault = EZpvd((AbstractC59242zdO) abstractC59331zeyAkhnZx);
        } else {
            if (!(abstractC59331zeyAkhnZx instanceof AbstractC59272zds)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC59272zds abstractC59272zds = (AbstractC59272zds) abstractC59331zeyAkhnZx;
            AbstractC59242zdO abstractC59242zdOEZpvd = EZpvd(abstractC59272zds.valueOf());
            AbstractC59242zdO abstractC59242zdOEZpvd2 = EZpvd(abstractC59272zds.AYXKKw());
            abstractC59331zeyCopydefault = (abstractC59242zdOEZpvd == abstractC59272zds.valueOf() && abstractC59242zdOEZpvd2 == abstractC59272zds.AYXKKw()) ? abstractC59331zeyAkhnZx : C59231zdD.copydefault(abstractC59242zdOEZpvd, abstractC59242zdOEZpvd2);
        }
        return C59327zeu.OLrzqt(abstractC59331zeyCopydefault, abstractC59331zeyAkhnZx, new KotlinTypePreparator$prepareType$1(this));
    }

    /* JADX INFO: renamed from: o.zeA$Application */
    public static final class Application extends AbstractC59281zeA {
        public static final Application copydefault = new Application();

        private Application() {
        }
    }
}
