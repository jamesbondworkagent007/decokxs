package o;

import com.okinc.okex.debug.bean.DetectIssueParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45460sqH implements InterfaceC43234rlT {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.sqH$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sqH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        OLrzqt(context, map);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void OLrzqt(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("currencyId");
        DetectIssueParams detectIssueParams = null;
        detectIssueParams = null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Integer intOrNull = str != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str) : null;
        if (C34703nhO.AhwBna(context) && intOrNull != null) {
            java.lang.Object obj2 = map.get("chainId");
            java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.Integer intOrNull2 = str2 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str2) : null;
            java.lang.Object obj3 = map.get("txid");
            detectIssueParams = new DetectIssueParams(intOrNull.intValue(), intOrNull2, obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null);
        }
        context.startActivity(ActivityC44946sgX.Companion.OLrzqt(context, detectIssueParams));
    }
}
