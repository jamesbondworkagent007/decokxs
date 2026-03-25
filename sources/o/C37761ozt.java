package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.di.IMConfigModule;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: renamed from: o.ozt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37761ozt {
    public static final C37761ozt KWHzl = new C37761ozt();

    private C37761ozt() {
    }

    public final void AEQbTJ() {
        djBIcL();
        C35398nub.EZpvd.KWHzl();
        AhwBna();
        EZpvd();
        OLrzqt();
        KWHzl();
        copydefault();
    }

    public final void djBIcL() {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        try {
            Result.Application application = Result.Companion;
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC35178nqS.class);
            if (listKWHzl != null) {
                java.util.Iterator it = listKWHzl.iterator();
                while (it.hasNext()) {
                    java.util.Iterator<T> it2 = ((InterfaceC35178nqS) it.next()).AhwBna().iterator();
                    while (it2.hasNext()) {
                        AbstractC35703oAo abstractC35703oAo = (AbstractC35703oAo) it2.next();
                        pUU.KWHzl("IMRegisterUtil", "Register view provider: " + abstractC35703oAo.getClass().getName());
                        C35696oAh.KWHzl.EZpvd(abstractC35703oAo);
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("IMRegisterUtil", "registerViewProvidersFromExtensions exception: " + thM7380exceptionOrNullimpl);
        }
    }

    public final void AhwBna() {
        for (Map.Entry entry : C56424yEw.djBIcL(C56390yDp.OLrzqt("IMContactBlockedSendInterceptor", new C36594ods())).entrySet()) {
            C36595odt.EZpvd.KWHzl((java.lang.String) entry.getKey(), (InterfaceC35277nsL) entry.getValue());
        }
    }

    public final void EZpvd() {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        try {
            Result.Application application = Result.Companion;
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC35178nqS.class);
            if (listKWHzl != null) {
                java.util.Iterator it = listKWHzl.iterator();
                while (it.hasNext()) {
                    for (C35247nri c35247nri : ((InterfaceC35178nqS) it.next()).KWHzl()) {
                        pUU.KWHzl("IMRegisterUtil", "Register page type interceptors: pageType = " + c35247nri.copydefault() + ", interceptor = " + c35247nri.KWHzl());
                        C36596odu.copydefault.EZpvd(c35247nri.copydefault(), c35247nri.KWHzl());
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("IMRegisterUtil", "registerPageTypeInterceptors exception: " + thM7380exceptionOrNullimpl);
        }
    }

    public final void OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        try {
            Result.Application application = Result.Companion;
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC35178nqS.class);
            if (listKWHzl != null) {
                java.util.Iterator it = listKWHzl.iterator();
                while (it.hasNext()) {
                    for (C35252nrn c35252nrn : ((InterfaceC35178nqS) it.next()).djBIcL()) {
                        pUU.KWHzl("IMRegisterUtil", "Register send message interceptors: pageType = " + c35252nrn.EZpvd() + ", interceptor = " + c35252nrn.copydefault());
                        C36595odt.EZpvd.EZpvd(c35252nrn.EZpvd(), c35252nrn.copydefault());
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("IMRegisterUtil", "registerPageTypeInterceptors exception: " + thM7380exceptionOrNullimpl);
        }
    }

    public final void KWHzl() {
        C36596odu.copydefault.KWHzl(IMPageType.NORMAL_IM, IMConfigModule.copydefault.OLrzqt());
    }

    public final void copydefault() {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        try {
            Result.Application application = Result.Companion;
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC35178nqS.class);
            if (listKWHzl != null) {
                java.util.Iterator it = listKWHzl.iterator();
                while (it.hasNext()) {
                    for (C35245nrg c35245nrg : ((InterfaceC35178nqS) it.next()).AEQbTJ()) {
                        pUU.KWHzl("IMRegisterUtil", "Register page config: pageType = " + c35245nrg.OLrzqt() + ", pageConfig = " + c35245nrg.EZpvd());
                        C36596odu.copydefault.KWHzl(c35245nrg.OLrzqt(), c35245nrg.EZpvd());
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("IMRegisterUtil", "registerPageConfigFromExtensions exception: " + thM7380exceptionOrNullimpl);
        }
    }
}
