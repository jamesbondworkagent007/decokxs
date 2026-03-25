package o;

import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.C54520xLl;

/* JADX INFO: renamed from: o.uyF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49948uyF extends AbstractC49947uyE<C47988uAv> {
    public final uBH KWHzl;
    public Function0<java.lang.Boolean> OLrzqt;
    public final C47988uAv copydefault;
    public Function0<java.lang.String> gEmmrt;

    public abstract java.lang.String EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47988uAv copydefault() {
        return this.copydefault;
    }

    public static /* synthetic */ C54520xLl.Activity getUserBehaviorReport$default(AbstractC49948uyF abstractC49948uyF, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserBehaviorReport");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return abstractC49948uyF.OLrzqt(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54520xLl.Activity OLrzqt(boolean z) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strInvoke;
        java.lang.String str3 = z ? "system" : "user";
        if (z) {
            str2 = "";
        } else {
            if (!this.OLrzqt.invoke().booleanValue()) {
                str = Web3SecurityTrackEvent.VALUE_INPUT;
                java.lang.String strEZpvd = EZpvd();
                java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("component", KWHzl().name()), C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, copydefault().AkhnZx()));
                strInvoke = this.gEmmrt.invoke();
                if (strInvoke != null) {
                    mapDjBIcL.put("percent", strInvoke);
                }
                Unit unit = Unit.INSTANCE;
                return new C54520xLl.Activity(str3, str, strEZpvd, null, null, mapDjBIcL, 24, null);
            }
            str2 = "seek_bar";
        }
        str = str2;
        java.lang.String strEZpvd2 = EZpvd();
        java.util.Map mapDjBIcL2 = C56424yEw.djBIcL(C56390yDp.OLrzqt("component", KWHzl().name()), C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, copydefault().AkhnZx()));
        strInvoke = this.gEmmrt.invoke();
        if (strInvoke != null) {
        }
        Unit unit2 = Unit.INSTANCE;
        return new C54520xLl.Activity(str3, str, strEZpvd2, null, null, mapDjBIcL2, 24, null);
    }

    public static /* synthetic */ void reportUserBehavior$default(AbstractC49948uyF abstractC49948uyF, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportUserBehavior");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC49948uyF.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        C54520xLl.Activity activityOLrzqt = OLrzqt(z);
        if (z) {
            return;
        }
        C54520xLl.KWHzl.AEQbTJ(activityOLrzqt);
    }

    public static /* synthetic */ void showInputSeekBar$default(AbstractC49948uyF abstractC49948uyF, android.util.AttributeSet attributeSet, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showInputSeekBar");
        }
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        abstractC49948uyF.EZpvd(attributeSet);
    }

    public final void EZpvd(android.util.AttributeSet attributeSet) {
        C47988uAv.showInputSeekBar$default(copydefault(), attributeSet, false, 2, null);
    }

    public static /* synthetic */ void setInputContent$default(AbstractC49948uyF abstractC49948uyF, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInputContent");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        abstractC49948uyF.EZpvd(str, z, z2);
    }

    public final void EZpvd(java.lang.String str, boolean z, boolean z2) {
        copydefault().setInputContent(str, z, z2);
        KWHzl(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uyF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPercentSeekBarListener$default(AbstractC49948uyF abstractC49948uyF, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPercentSeekBarListener");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        abstractC49948uyF.EZpvd((Function1<? super java.lang.Float, Unit>) function1);
    }

    public final void EZpvd(Function1<? super java.lang.Float, Unit> function1) {
        copydefault().setPercentSeekBarListener(function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uyF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addPercentSeekBarListener$default(AbstractC49948uyF abstractC49948uyF, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPercentSeekBarListener");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        abstractC49948uyF.AEQbTJ(function1);
    }

    public final void AEQbTJ(Function1<? super java.lang.Float, Unit> function1) {
        copydefault().copydefault(function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uyF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removePercentSeekBarListener$default(AbstractC49948uyF abstractC49948uyF, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removePercentSeekBarListener");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        abstractC49948uyF.OLrzqt((Function1<? super java.lang.Float, Unit>) function1);
    }

    public final void OLrzqt(Function1<? super java.lang.Float, Unit> function1) {
        copydefault().AEQbTJ(function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uyF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setUnitClick$default(AbstractC49948uyF abstractC49948uyF, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUnitClick");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        abstractC49948uyF.copydefault(function0);
    }

    public final void copydefault(Function0<Unit> function0) {
        copydefault().setUnitClickable(function0 != null, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uyF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setLabelClick$default(AbstractC49948uyF abstractC49948uyF, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLabelClick");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        abstractC49948uyF.EZpvd((Function0<Unit>) function0);
    }

    public final void EZpvd(Function0<Unit> function0) {
        copydefault().setLabelClickable(function0 != null, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uyF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void seekBarClickCallback$default(AbstractC49948uyF abstractC49948uyF, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: seekBarClickCallback");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        abstractC49948uyF.KWHzl((Function1<? super java.lang.Float, Unit>) function1);
    }

    public final void KWHzl(Function1<? super java.lang.Float, Unit> function1) {
        copydefault().setSeekBarClickCallback(function1);
    }
}
