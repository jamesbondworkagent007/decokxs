package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC28108kPe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kPg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28110kPg {
    public static final C28110kPg KWHzl = new C28110kPg();
    public static final java.util.Map<java.lang.String, java.lang.String> copydefault = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, java.lang.Boolean> OLrzqt = new LinkedHashMap();
    public static final int EZpvd = 8;

    private C28110kPg() {
    }

    public final void copydefault(@NotNull final AbstractC28108kPe abstractC28108kPe) {
        Intrinsics.checkNotNullParameter(abstractC28108kPe, "");
        if (abstractC28108kPe instanceof AbstractC28108kPe.Activity) {
            AbstractC28108kPe.Activity activity = (AbstractC28108kPe.Activity) abstractC28108kPe;
            if (activity.AEQbTJ().length() > 0) {
                copydefault.put(activity.AEQbTJ(), activity.copydefault().EZpvd());
            }
        }
        if (abstractC28108kPe instanceof AbstractC28108kPe.StateListAnimator) {
            AbstractC28108kPe.StateListAnimator stateListAnimator = (AbstractC28108kPe.StateListAnimator) abstractC28108kPe;
            OLrzqt.put(stateListAnimator.copydefault().EZpvd(), java.lang.Boolean.valueOf(stateListAnimator.KWHzl() == SignAuthType.SILENT));
        }
        C32866mlf.onEvent$default(abstractC28108kPe.EZpvd(), (TrackChannel[]) null, new Function1() { // from class: o.kPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28110kPg.KWHzl(abstractC28108kPe, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (abstractC28108kPe instanceof AbstractC28108kPe.Application) {
            AbstractC28108kPe.Application application = (AbstractC28108kPe.Application) abstractC28108kPe;
            copydefault.remove(application.KWHzl());
            OLrzqt.remove(application.copydefault().EZpvd());
        }
    }

    public static final Unit KWHzl(AbstractC28108kPe abstractC28108kPe, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.util.Map<java.lang.String, java.lang.String> mapEZpvd = C28116kPm.EZpvd(abstractC28108kPe.copydefault(), KWHzl.KWHzl(abstractC28108kPe.copydefault().EZpvd(), abstractC28108kPe.copydefault().AYXKKw()));
        mapEZpvd.putAll(abstractC28108kPe.OLrzqt());
        mapEZpvd.put("extra_info", C23316hvt.OLrzqt(mapEZpvd));
        for (Map.Entry<java.lang.String, java.lang.String> entry : mapEZpvd.entrySet()) {
            EventParamsList.put$default(eventParamsList, entry.getKey(), entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault.get(str);
    }

    public final boolean KWHzl(java.lang.String str, boolean z) {
        java.lang.Boolean bool = OLrzqt.get(str);
        return bool != null ? bool.booleanValue() : z ? C22416heu.getFieldNames() : C22416heu.fARcdN();
    }
}
