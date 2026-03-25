package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44716scF extends C43265rly {
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean needRunOnProcess(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        return true;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull final android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC6804aWL.class, C56392yDr.copydefault(new Function0() { // from class: o.scJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44716scF.EZpvd(context);
            }
        }));
    }

    public static final InterfaceC6804aWL EZpvd(android.content.Context context) {
        return ((InterfaceC44713scC) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC44713scC.class)).aCSzUz();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        ((InterfaceC45539srt) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC45539srt.class)).RvdRAu().EZpvd();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        C45470sqR.EZpvd(interfaceC43237rlW);
        C45457sqE.OLrzqt(interfaceC43237rlW);
        C45525srf.OLrzqt(interfaceC43237rlW);
        C45501sqw.KWHzl(interfaceC43237rlW);
        C45455sqC.KWHzl(interfaceC43237rlW);
        C45496sqr.KWHzl(interfaceC43237rlW);
        C45461sqI.copydefault(interfaceC43237rlW);
        C45469sqQ.AEQbTJ(interfaceC43237rlW);
        C45473sqU.AEQbTJ(interfaceC43237rlW);
        C45535srp.EZpvd(interfaceC43237rlW);
        C45534sro.EZpvd(interfaceC43237rlW);
        C45528sri.OLrzqt(interfaceC43237rlW);
        C45478sqZ.KWHzl(interfaceC43237rlW);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerCustomHandler(@NotNull android.content.Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        super.registerCustomHandler(context, interfaceC43220rlF);
        C57337ygX.EZpvd(interfaceC43220rlF, new C45691sun());
        C57337ygX.EZpvd(interfaceC43220rlF, new C45685suh());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.scK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44716scF.OLrzqt();
            }
        }));
    }

    public static final C45444sps OLrzqt() {
        return new C45444sps();
    }
}
