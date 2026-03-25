package o;

import com.okinc.business.invest_biz.data.bean.HomeTokensItemData;
import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardContentUseCaseImpl$fetchDataByMode$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardContentUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardContentUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC24202iYr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26360jap implements InterfaceC26363jas {
    public final InterfaceC26362jar AEQbTJ;
    public final InterfaceC26359jao AhwBna;
    public final InterfaceC26365jau EZpvd;
    public final iFW KWHzl;
    public final InterfaceC26357jam OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final iFD gEmmrt;

    /* JADX INFO: renamed from: o.jap$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DashboardListMode.values().length];
            try {
                iArr[DashboardListMode.PROTOCOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DashboardListMode.TOKEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DashboardListMode.RECOMMEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public C26360jap(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC26357jam interfaceC26357jam, @NotNull InterfaceC26359jao interfaceC26359jao, @NotNull InterfaceC26365jau interfaceC26365jau, @NotNull InterfaceC26362jar interfaceC26362jar, @NotNull iFW ifw, @NotNull iFD ifd) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC26357jam, "");
        Intrinsics.checkNotNullParameter(interfaceC26359jao, "");
        Intrinsics.checkNotNullParameter(interfaceC26365jau, "");
        Intrinsics.checkNotNullParameter(interfaceC26362jar, "");
        Intrinsics.checkNotNullParameter(ifw, "");
        Intrinsics.checkNotNullParameter(ifd, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = interfaceC26357jam;
        this.AhwBna = interfaceC26359jao;
        this.EZpvd = interfaceC26365jau;
        this.AEQbTJ = interfaceC26362jar;
        this.KWHzl = ifw;
        this.gEmmrt = ifd;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C26360jap(@NotNull InterfaceC26357jam interfaceC26357jam, @NotNull InterfaceC26359jao interfaceC26359jao, @NotNull InterfaceC26365jau interfaceC26365jau, @NotNull InterfaceC26362jar interfaceC26362jar, @NotNull iFW ifw, @NotNull iFD ifd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(coroutineDispatcher, interfaceC26357jam, interfaceC26359jao, interfaceC26365jau, interfaceC26362jar, ifw, ifd);
        Intrinsics.checkNotNullParameter(interfaceC26357jam, "");
        Intrinsics.checkNotNullParameter(interfaceC26359jao, "");
        Intrinsics.checkNotNullParameter(interfaceC26365jau, "");
        Intrinsics.checkNotNullParameter(interfaceC26362jar, "");
        Intrinsics.checkNotNullParameter(ifw, "");
        Intrinsics.checkNotNullParameter(ifd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC26363jas
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(long j, @NotNull Continuation<? super Result<? extends InterfaceC24202iYr>> continuation) {
        DashboardContentUseCaseImpl$invoke$1 dashboardContentUseCaseImpl$invoke$1;
        if (continuation instanceof DashboardContentUseCaseImpl$invoke$1) {
            dashboardContentUseCaseImpl$invoke$1 = (DashboardContentUseCaseImpl$invoke$1) continuation;
            int i = dashboardContentUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardContentUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardContentUseCaseImpl$invoke$1 = new DashboardContentUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardContentUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardContentUseCaseImpl$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.copydefault;
        DashboardContentUseCaseImpl$invoke$2 dashboardContentUseCaseImpl$invoke$2 = new DashboardContentUseCaseImpl$invoke$2(this, j, null);
        dashboardContentUseCaseImpl$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardContentUseCaseImpl$invoke$2, dashboardContentUseCaseImpl$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [84=4] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143 A[PHI: r15
  0x0143: PHI (r15v17 java.lang.Object) = (r15v16 java.lang.Object), (r15v1 java.lang.Object) binds: [B:61:0x0140, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(DashboardListMode dashboardListMode, long j, boolean z, Continuation<? super InterfaceC24202iYr> continuation) throws java.lang.Throwable {
        DashboardContentUseCaseImpl$fetchDataByMode$1 dashboardContentUseCaseImpl$fetchDataByMode$1;
        C26360jap c26360jap;
        C26360jap c26360jap2;
        java.lang.Object objCopydefault;
        C26360jap c26360jap3;
        kotlin.Pair pair;
        kotlin.Pair pair2;
        HomeTokensResponse homeTokensResponse;
        java.util.List<HomeTokensItemData> list;
        int i;
        if (continuation instanceof DashboardContentUseCaseImpl$fetchDataByMode$1) {
            dashboardContentUseCaseImpl$fetchDataByMode$1 = (DashboardContentUseCaseImpl$fetchDataByMode$1) continuation;
            int i2 = dashboardContentUseCaseImpl$fetchDataByMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardContentUseCaseImpl$fetchDataByMode$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dashboardContentUseCaseImpl$fetchDataByMode$1 = new DashboardContentUseCaseImpl$fetchDataByMode$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = dashboardContentUseCaseImpl$fetchDataByMode$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (dashboardContentUseCaseImpl$fetchDataByMode$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objKWHzl);
                int i3 = dashboardListMode == null ? -1 : Activity.AEQbTJ[dashboardListMode.ordinal()];
                if (i3 == 1) {
                    InterfaceC26362jar interfaceC26362jar = this.AEQbTJ;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.L$0 = this;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.J$0 = j;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.Z$0 = z;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.label = 1;
                    objKWHzl = interfaceC26362jar.KWHzl(dashboardListMode, j, z, dashboardContentUseCaseImpl$fetchDataByMode$1);
                    if (objKWHzl == objCopydefault2) {
                        return objCopydefault2;
                    }
                    c26360jap = this;
                    long j2 = j;
                    boolean z2 = z;
                    pair = (kotlin.Pair) objKWHzl;
                    if (pair.getFirst() == DashboardListMode.RECOMMEND) {
                        return (InterfaceC24202iYr) pair.getSecond();
                    }
                    DashboardListMode dashboardListMode2 = (DashboardListMode) pair.getFirst();
                    dashboardContentUseCaseImpl$fetchDataByMode$1.L$0 = null;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.label = 2;
                    objKWHzl = c26360jap.KWHzl(dashboardListMode2, j2, z2, dashboardContentUseCaseImpl$fetchDataByMode$1);
                    return objKWHzl == objCopydefault2 ? objCopydefault2 : objKWHzl;
                }
                if (i3 == 2) {
                    InterfaceC26365jau interfaceC26365jau = this.EZpvd;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.L$0 = this;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.J$0 = j;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.Z$0 = z;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.label = 3;
                    objKWHzl = interfaceC26365jau.OLrzqt(dashboardListMode, j, dashboardContentUseCaseImpl$fetchDataByMode$1);
                    if (objKWHzl == objCopydefault2) {
                        return objCopydefault2;
                    }
                    c26360jap2 = this;
                    long j3 = j;
                    boolean z3 = z;
                    pair2 = (kotlin.Pair) objKWHzl;
                    if (pair2.getFirst() == DashboardListMode.PROTOCOL && pair2.getFirst() != DashboardListMode.RECOMMEND) {
                        return (InterfaceC24202iYr) pair2.getSecond();
                    }
                    DashboardListMode dashboardListMode3 = (DashboardListMode) pair2.getFirst();
                    dashboardContentUseCaseImpl$fetchDataByMode$1.L$0 = null;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.label = 4;
                    objKWHzl = c26360jap2.KWHzl(dashboardListMode3, j3, z3, dashboardContentUseCaseImpl$fetchDataByMode$1);
                    return objKWHzl != objCopydefault2 ? objCopydefault2 : objKWHzl;
                }
                if (i3 != 3) {
                    InterfaceC26362jar interfaceC26362jar2 = this.AEQbTJ;
                    DashboardListMode dashboardListMode4 = DashboardListMode.PROTOCOL;
                    dashboardContentUseCaseImpl$fetchDataByMode$1.label = 7;
                    objKWHzl = interfaceC26362jar2.KWHzl(dashboardListMode4, j, z, dashboardContentUseCaseImpl$fetchDataByMode$1);
                    if (objKWHzl == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return (InterfaceC24202iYr) ((kotlin.Pair) objKWHzl).getSecond();
                }
                iFW ifw = this.KWHzl;
                dashboardContentUseCaseImpl$fetchDataByMode$1.L$0 = this;
                dashboardContentUseCaseImpl$fetchDataByMode$1.label = 5;
                objCopydefault = ifw.copydefault(true, dashboardContentUseCaseImpl$fetchDataByMode$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c26360jap3 = this;
                if (Result.m7383isFailureimpl(objCopydefault)) {
                    objCopydefault = null;
                }
                homeTokensResponse = (HomeTokensResponse) objCopydefault;
                if (homeTokensResponse != null || !(!homeTokensResponse.KWHzl().isEmpty())) {
                    return new InterfaceC24202iYr.Application(true, false, 2, null);
                }
                java.util.List<HomeTokensItemData> listKWHzl = homeTokensResponse.KWHzl();
                int iAEQbTJ = homeTokensResponse.AEQbTJ();
                iFD ifd = c26360jap3.gEmmrt;
                java.util.List<HomeTokensItemData> listKWHzl2 = homeTokensResponse.KWHzl();
                dashboardContentUseCaseImpl$fetchDataByMode$1.L$0 = listKWHzl;
                dashboardContentUseCaseImpl$fetchDataByMode$1.I$0 = iAEQbTJ;
                dashboardContentUseCaseImpl$fetchDataByMode$1.label = 6;
                objKWHzl = ifd.EZpvd(listKWHzl2, dashboardContentUseCaseImpl$fetchDataByMode$1);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                list = listKWHzl;
                i = iAEQbTJ;
                return new InterfaceC24202iYr.LoaderManager(new iYC(list, i, (java.util.List) objKWHzl), false, 2, null);
            case 1:
                z = dashboardContentUseCaseImpl$fetchDataByMode$1.Z$0;
                j = dashboardContentUseCaseImpl$fetchDataByMode$1.J$0;
                C26360jap c26360jap4 = (C26360jap) dashboardContentUseCaseImpl$fetchDataByMode$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                c26360jap = c26360jap4;
                long j22 = j;
                boolean z22 = z;
                pair = (kotlin.Pair) objKWHzl;
                if (pair.getFirst() == DashboardListMode.RECOMMEND) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(objKWHzl);
            case 3:
                z = dashboardContentUseCaseImpl$fetchDataByMode$1.Z$0;
                j = dashboardContentUseCaseImpl$fetchDataByMode$1.J$0;
                C26360jap c26360jap5 = (C26360jap) dashboardContentUseCaseImpl$fetchDataByMode$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                c26360jap2 = c26360jap5;
                long j32 = j;
                boolean z32 = z;
                pair2 = (kotlin.Pair) objKWHzl;
                if (pair2.getFirst() == DashboardListMode.PROTOCOL) {
                }
                DashboardListMode dashboardListMode32 = (DashboardListMode) pair2.getFirst();
                dashboardContentUseCaseImpl$fetchDataByMode$1.L$0 = null;
                dashboardContentUseCaseImpl$fetchDataByMode$1.label = 4;
                objKWHzl = c26360jap2.KWHzl(dashboardListMode32, j32, z32, dashboardContentUseCaseImpl$fetchDataByMode$1);
                if (objKWHzl != objCopydefault2) {
                }
                break;
            case 4:
                C56391yDq.AEQbTJ(objKWHzl);
            case 5:
                c26360jap3 = (C26360jap) dashboardContentUseCaseImpl$fetchDataByMode$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                objCopydefault = ((Result) objKWHzl).m7386unboximpl();
                if (Result.m7383isFailureimpl(objCopydefault)) {
                }
                homeTokensResponse = (HomeTokensResponse) objCopydefault;
                if (homeTokensResponse != null) {
                    break;
                }
                return new InterfaceC24202iYr.Application(true, false, 2, null);
            case 6:
                i = dashboardContentUseCaseImpl$fetchDataByMode$1.I$0;
                list = (java.util.List) dashboardContentUseCaseImpl$fetchDataByMode$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                return new InterfaceC24202iYr.LoaderManager(new iYC(list, i, (java.util.List) objKWHzl), false, 2, null);
            case 7:
                C56391yDq.AEQbTJ(objKWHzl);
                return (InterfaceC24202iYr) ((kotlin.Pair) objKWHzl).getSecond();
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
