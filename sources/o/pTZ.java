package o;

import com.okinc.localization2.bean.LanguageUnit;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pTZ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final android.content.Context AEQbTJ;
    public final java.util.Map<LanguageUnit, java.lang.String> EZpvd;
    public final java.util.Map<LanguageUnit, android.content.Context> KWHzl;
    public final java.util.List<java.lang.String> copydefault;

    @yCM
    public pTZ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.EZpvd = new ConcurrentHashMap();
        this.KWHzl = new ConcurrentHashMap();
        this.copydefault = new java.util.ArrayList();
    }

    public final void copydefault(java.lang.String str) {
        for (pTW ptw : pTG.OLrzqt.copydefault(this.AEQbTJ, str)) {
            this.EZpvd.put(new LanguageUnit(str, ptw.EZpvd()), ptw.AEQbTJ());
        }
        this.copydefault.add(str);
    }

    public final java.lang.String copydefault(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        if (!this.copydefault.contains(languageUnit.getMarket())) {
            copydefault(languageUnit.getMarket());
        }
        return this.EZpvd.get(languageUnit);
    }

    public final android.content.Context KWHzl(@NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        android.content.Context context = this.KWHzl.get(languageUnit);
        if (context != null) {
            return context;
        }
        java.lang.String strCopydefault = copydefault(languageUnit);
        if (strCopydefault == null) {
            pUU.valueOf("LPMappingRepo", "getMappingContext, mappingCode is null, languageUnit:" + languageUnit);
            android.content.Context context2 = this.AEQbTJ;
            Intrinsics.copydefault(context2, "");
            android.content.Context baseContext = ((android.app.Application) context2).getBaseContext();
            this.KWHzl.put(languageUnit, baseContext);
            Intrinsics.copydefault(baseContext);
            return baseContext;
        }
        android.content.res.Configuration configuration = new android.content.res.Configuration(this.AEQbTJ.getResources().getConfiguration());
        configuration.setLocale(java.util.Locale.forLanguageTag(strCopydefault));
        android.content.Context contextCreateConfigurationContext = this.AEQbTJ.createConfigurationContext(configuration);
        this.KWHzl.put(languageUnit, contextCreateConfigurationContext);
        Intrinsics.copydefault(contextCreateConfigurationContext);
        return contextCreateConfigurationContext;
    }

    public final void OLrzqt() {
        pUU.KWHzl("LPMappingRepo", "clearContextCache. start");
        this.KWHzl.clear();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
