package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$checkFollow$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$checkFollow$4$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$confirmIfUnfollow$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$editTrackerAlias$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$editTrackerAlias$2$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$handleFollow$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$handleFollow$2$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$selectTrackerGroupApi$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$selectTrackerGroupApi$2$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$toggleFollowStateApi$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$toggleFollowStateApi$2$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$toggleFollowStatus$1;
import com.okinc.business.market.features.address_tracker.domain.TrackerApiKt$toggleFollowStatus$3$1$1$1;
import com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionParams;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C23274hvD;
import o.InterfaceC25657jBn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAT {
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull jAL jal, @NotNull jAK jak, @NotNull jAF jaf, @NotNull C25640jAx c25640jAx, @NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, Function1<? super java.lang.Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrackerApiKt$toggleFollowStateApi$1 trackerApiKt$toggleFollowStateApi$1;
        jAK jak2;
        jAF jaf2;
        C25640jAx c25640jAx2;
        android.content.Context context2;
        androidx.fragment.app.FragmentManager fragmentManager2;
        C28603kdr c28603kdr2;
        Function1<? super java.lang.Boolean, Unit> function12;
        jAL jal2;
        boolean z2;
        java.lang.Object objM7386unboximpl;
        java.lang.String str2;
        Function1<? super java.lang.Boolean, Unit> function13;
        java.lang.Object objM7386unboximpl2;
        java.lang.String str3;
        jAK jak3;
        jAL jal3;
        DexUserIdentity dexUserIdentity;
        C28603kdr c28603kdr3;
        android.content.Context context3;
        androidx.fragment.app.FragmentManager fragmentManager3;
        final jAL jal4;
        android.content.Context context4;
        final C28603kdr c28603kdr4;
        final jAK jak4;
        final DexUserIdentity dexUserIdentity2;
        final boolean z3;
        final Function1<? super java.lang.Boolean, Unit> function14;
        final C25640jAx c25640jAx3;
        final java.lang.String str4;
        java.lang.Object objM7386unboximpl3;
        final java.lang.String str5;
        final jAF jaf3;
        final androidx.fragment.app.FragmentManager fragmentManager4;
        DappSignArgs dappSignArgs;
        if (continuation instanceof TrackerApiKt$toggleFollowStateApi$1) {
            trackerApiKt$toggleFollowStateApi$1 = (TrackerApiKt$toggleFollowStateApi$1) continuation;
            int i = trackerApiKt$toggleFollowStateApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerApiKt$toggleFollowStateApi$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerApiKt$toggleFollowStateApi$1 = new TrackerApiKt$toggleFollowStateApi$1(continuation);
            }
        }
        java.lang.Object obj = trackerApiKt$toggleFollowStateApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerApiKt$toggleFollowStateApi$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            trackerApiKt$toggleFollowStateApi$1.L$0 = c28603kdr;
            trackerApiKt$toggleFollowStateApi$1.L$1 = jal;
            jak2 = jak;
            trackerApiKt$toggleFollowStateApi$1.L$2 = jak2;
            jaf2 = jaf;
            trackerApiKt$toggleFollowStateApi$1.L$3 = jaf2;
            c25640jAx2 = c25640jAx;
            trackerApiKt$toggleFollowStateApi$1.L$4 = c25640jAx2;
            context2 = context;
            trackerApiKt$toggleFollowStateApi$1.L$5 = context2;
            fragmentManager2 = fragmentManager;
            trackerApiKt$toggleFollowStateApi$1.L$6 = fragmentManager2;
            trackerApiKt$toggleFollowStateApi$1.L$7 = str;
            trackerApiKt$toggleFollowStateApi$1.L$8 = function1;
            trackerApiKt$toggleFollowStateApi$1.Z$0 = z;
            trackerApiKt$toggleFollowStateApi$1.label = 1;
            java.lang.Object objOLrzqt = c28586kda.OLrzqt(trackerApiKt$toggleFollowStateApi$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c28603kdr2 = c28603kdr;
            function12 = function1;
            jal2 = jal;
            z2 = z;
            objM7386unboximpl = objOLrzqt;
            str2 = str;
        } else if (i2 == 1) {
            z2 = trackerApiKt$toggleFollowStateApi$1.Z$0;
            Function1<? super java.lang.Boolean, Unit> function15 = (Function1) trackerApiKt$toggleFollowStateApi$1.L$8;
            str2 = (java.lang.String) trackerApiKt$toggleFollowStateApi$1.L$7;
            androidx.fragment.app.FragmentManager fragmentManager5 = (androidx.fragment.app.FragmentManager) trackerApiKt$toggleFollowStateApi$1.L$6;
            android.content.Context context5 = (android.content.Context) trackerApiKt$toggleFollowStateApi$1.L$5;
            C25640jAx c25640jAx4 = (C25640jAx) trackerApiKt$toggleFollowStateApi$1.L$4;
            jAF jaf4 = (jAF) trackerApiKt$toggleFollowStateApi$1.L$3;
            jAK jak5 = (jAK) trackerApiKt$toggleFollowStateApi$1.L$2;
            jal2 = (jAL) trackerApiKt$toggleFollowStateApi$1.L$1;
            c28603kdr2 = (C28603kdr) trackerApiKt$toggleFollowStateApi$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            function12 = function15;
            jak2 = jak5;
            fragmentManager2 = fragmentManager5;
            jaf2 = jaf4;
            context2 = context5;
            c25640jAx2 = c25640jAx4;
        } else {
            if (i2 == 2) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                boolean z4 = trackerApiKt$toggleFollowStateApi$1.Z$0;
                str4 = (java.lang.String) trackerApiKt$toggleFollowStateApi$1.L$10;
                dexUserIdentity2 = (DexUserIdentity) trackerApiKt$toggleFollowStateApi$1.L$9;
                Function1<? super java.lang.Boolean, Unit> function16 = (Function1) trackerApiKt$toggleFollowStateApi$1.L$8;
                java.lang.String str6 = (java.lang.String) trackerApiKt$toggleFollowStateApi$1.L$7;
                androidx.fragment.app.FragmentManager fragmentManager6 = (androidx.fragment.app.FragmentManager) trackerApiKt$toggleFollowStateApi$1.L$6;
                android.content.Context context6 = (android.content.Context) trackerApiKt$toggleFollowStateApi$1.L$5;
                C25640jAx c25640jAx5 = (C25640jAx) trackerApiKt$toggleFollowStateApi$1.L$4;
                jAF jaf5 = (jAF) trackerApiKt$toggleFollowStateApi$1.L$3;
                jAK jak6 = (jAK) trackerApiKt$toggleFollowStateApi$1.L$2;
                jAL jal5 = (jAL) trackerApiKt$toggleFollowStateApi$1.L$1;
                C28603kdr c28603kdr5 = (C28603kdr) trackerApiKt$toggleFollowStateApi$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl3 = ((Result) obj).m7386unboximpl();
                fragmentManager4 = fragmentManager6;
                context4 = context6;
                c25640jAx3 = c25640jAx5;
                jaf3 = jaf5;
                str5 = str6;
                jak4 = jak6;
                z3 = z4;
                c28603kdr4 = c28603kdr5;
                function14 = function16;
                jal4 = jal5;
                if (Result.m7383isFailureimpl(objM7386unboximpl3)) {
                    objM7386unboximpl3 = null;
                }
                dappSignArgs = (DappSignArgs) objM7386unboximpl3;
                if (dappSignArgs != null) {
                    return Unit.INSTANCE;
                }
                final android.content.Context context7 = context4;
                ((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class)).EZpvd(context4, dappSignArgs, new Function1() { // from class: o.jAU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return jAT.copydefault(c28603kdr4, str4, dexUserIdentity2, jal4, jak4, jaf3, c25640jAx3, fragmentManager4, str5, context7, z3, function14, (android.os.Bundle) obj2);
                    }
                }, null);
                return Unit.INSTANCE;
            }
            z2 = trackerApiKt$toggleFollowStateApi$1.Z$0;
            str3 = (java.lang.String) trackerApiKt$toggleFollowStateApi$1.L$10;
            DexUserIdentity dexUserIdentity3 = (DexUserIdentity) trackerApiKt$toggleFollowStateApi$1.L$9;
            function13 = (Function1) trackerApiKt$toggleFollowStateApi$1.L$8;
            java.lang.String str7 = (java.lang.String) trackerApiKt$toggleFollowStateApi$1.L$7;
            fragmentManager3 = (androidx.fragment.app.FragmentManager) trackerApiKt$toggleFollowStateApi$1.L$6;
            context3 = (android.content.Context) trackerApiKt$toggleFollowStateApi$1.L$5;
            C25640jAx c25640jAx6 = (C25640jAx) trackerApiKt$toggleFollowStateApi$1.L$4;
            jAF jaf6 = (jAF) trackerApiKt$toggleFollowStateApi$1.L$3;
            jak3 = (jAK) trackerApiKt$toggleFollowStateApi$1.L$2;
            jal3 = (jAL) trackerApiKt$toggleFollowStateApi$1.L$1;
            C28603kdr c28603kdr6 = (C28603kdr) trackerApiKt$toggleFollowStateApi$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
            dexUserIdentity = dexUserIdentity3;
            str2 = str7;
            c25640jAx2 = c25640jAx6;
            c28603kdr3 = c28603kdr6;
            jaf2 = jaf6;
            java.lang.Object objKWHzl = C56443yFo.KWHzl(false);
            if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                objM7386unboximpl2 = objKWHzl;
            }
            if (((java.lang.Boolean) objM7386unboximpl2).booleanValue()) {
                java.lang.String str8 = str3;
                long jOLrzqt = dexUserIdentity.OLrzqt();
                trackerApiKt$toggleFollowStateApi$1.L$0 = c28603kdr3;
                trackerApiKt$toggleFollowStateApi$1.L$1 = jal3;
                trackerApiKt$toggleFollowStateApi$1.L$2 = jak3;
                trackerApiKt$toggleFollowStateApi$1.L$3 = jaf2;
                trackerApiKt$toggleFollowStateApi$1.L$4 = c25640jAx2;
                trackerApiKt$toggleFollowStateApi$1.L$5 = context3;
                trackerApiKt$toggleFollowStateApi$1.L$6 = fragmentManager3;
                trackerApiKt$toggleFollowStateApi$1.L$7 = str2;
                trackerApiKt$toggleFollowStateApi$1.L$8 = function13;
                trackerApiKt$toggleFollowStateApi$1.L$9 = dexUserIdentity;
                trackerApiKt$toggleFollowStateApi$1.L$10 = str8;
                trackerApiKt$toggleFollowStateApi$1.Z$0 = z2;
                DexUserIdentity dexUserIdentity4 = dexUserIdentity;
                trackerApiKt$toggleFollowStateApi$1.label = 4;
                java.lang.Object objEZpvd = c28603kdr3.EZpvd(str8, jOLrzqt, trackerApiKt$toggleFollowStateApi$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                jal4 = jal3;
                context4 = context3;
                c28603kdr4 = c28603kdr3;
                jak4 = jak3;
                dexUserIdentity2 = dexUserIdentity4;
                z3 = z2;
                function14 = function13;
                c25640jAx3 = c25640jAx2;
                str4 = str8;
                objM7386unboximpl3 = objEZpvd;
                str5 = str2;
                jaf3 = jaf2;
                fragmentManager4 = fragmentManager3;
                if (Result.m7383isFailureimpl(objM7386unboximpl3)) {
                }
                dappSignArgs = (DappSignArgs) objM7386unboximpl3;
                if (dappSignArgs != null) {
                }
            } else {
                trackerApiKt$toggleFollowStateApi$1.L$0 = null;
                trackerApiKt$toggleFollowStateApi$1.L$1 = null;
                trackerApiKt$toggleFollowStateApi$1.L$2 = null;
                trackerApiKt$toggleFollowStateApi$1.L$3 = null;
                trackerApiKt$toggleFollowStateApi$1.L$4 = null;
                trackerApiKt$toggleFollowStateApi$1.L$5 = null;
                trackerApiKt$toggleFollowStateApi$1.L$6 = null;
                trackerApiKt$toggleFollowStateApi$1.L$7 = null;
                trackerApiKt$toggleFollowStateApi$1.L$8 = null;
                trackerApiKt$toggleFollowStateApi$1.L$9 = null;
                trackerApiKt$toggleFollowStateApi$1.L$10 = null;
                trackerApiKt$toggleFollowStateApi$1.label = 5;
                if (OLrzqt(jal3, jak3, jaf2, c25640jAx2, str3, fragmentManager3, str2, context3, z2, function13, trackerApiKt$toggleFollowStateApi$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        DexUserIdentity dexUserIdentity5 = (DexUserIdentity) objM7386unboximpl;
        if (dexUserIdentity5 == null || dexUserIdentity5.KWHzl()) {
            java.lang.String string = context2.getString(C23274hvD.Fragment.UlJrfe);
            Intrinsics.checkNotNullExpressionValue(string, "");
            trackerApiKt$toggleFollowStateApi$1.L$0 = null;
            trackerApiKt$toggleFollowStateApi$1.L$1 = null;
            trackerApiKt$toggleFollowStateApi$1.L$2 = null;
            trackerApiKt$toggleFollowStateApi$1.L$3 = null;
            trackerApiKt$toggleFollowStateApi$1.L$4 = null;
            trackerApiKt$toggleFollowStateApi$1.L$5 = null;
            trackerApiKt$toggleFollowStateApi$1.L$6 = null;
            trackerApiKt$toggleFollowStateApi$1.L$7 = null;
            trackerApiKt$toggleFollowStateApi$1.L$8 = null;
            trackerApiKt$toggleFollowStateApi$1.label = 2;
            if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$toggleFollowStateApi$1, 2, null) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        java.lang.String strEZpvd = dexUserIdentity5.EZpvd();
        trackerApiKt$toggleFollowStateApi$1.L$0 = c28603kdr2;
        trackerApiKt$toggleFollowStateApi$1.L$1 = jal2;
        trackerApiKt$toggleFollowStateApi$1.L$2 = jak2;
        trackerApiKt$toggleFollowStateApi$1.L$3 = jaf2;
        trackerApiKt$toggleFollowStateApi$1.L$4 = c25640jAx2;
        trackerApiKt$toggleFollowStateApi$1.L$5 = context2;
        trackerApiKt$toggleFollowStateApi$1.L$6 = fragmentManager2;
        trackerApiKt$toggleFollowStateApi$1.L$7 = str2;
        trackerApiKt$toggleFollowStateApi$1.L$8 = function12;
        trackerApiKt$toggleFollowStateApi$1.L$9 = dexUserIdentity5;
        trackerApiKt$toggleFollowStateApi$1.L$10 = strEZpvd;
        trackerApiKt$toggleFollowStateApi$1.Z$0 = z2;
        trackerApiKt$toggleFollowStateApi$1.label = 3;
        java.lang.Object objCopydefault2 = c28603kdr2.copydefault(strEZpvd, trackerApiKt$toggleFollowStateApi$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        function13 = function12;
        objM7386unboximpl2 = objCopydefault2;
        str3 = strEZpvd;
        C28603kdr c28603kdr7 = c28603kdr2;
        jak3 = jak2;
        jal3 = jal2;
        dexUserIdentity = dexUserIdentity5;
        c28603kdr3 = c28603kdr7;
        androidx.fragment.app.FragmentManager fragmentManager7 = fragmentManager2;
        context3 = context2;
        fragmentManager3 = fragmentManager7;
        java.lang.Object objKWHzl2 = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
        }
        if (((java.lang.Boolean) objM7386unboximpl2).booleanValue()) {
        }
    }

    public static final Unit copydefault(C28603kdr c28603kdr, java.lang.String str, DexUserIdentity dexUserIdentity, jAL jal, jAK jak, jAF jaf, C25640jAx c25640jAx, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str2, android.content.Context context, boolean z, Function1 function1, android.os.Bundle bundle) {
        C25389ivm.safeLaunch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TrackerApiKt$toggleFollowStateApi$2$1(c28603kdr, str, dexUserIdentity, bundle, jal, jak, jaf, c25640jAx, fragmentManager, str2, context, z, function1, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull jAL jal, @NotNull jAK jak, @NotNull jAF jaf, @NotNull C25640jAx c25640jAx, @NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrackerApiKt$selectTrackerGroupApi$1 trackerApiKt$selectTrackerGroupApi$1;
        jAK jak2;
        jAF jaf2;
        C25640jAx c25640jAx2;
        android.content.Context context2;
        androidx.fragment.app.FragmentManager fragmentManager2;
        C28603kdr c28603kdr2;
        Function1<? super java.lang.Boolean, Unit> function12;
        jAL jal2;
        boolean z2;
        java.lang.Object objM7386unboximpl;
        java.lang.String str2;
        Function1<? super java.lang.Boolean, Unit> function13;
        java.lang.Object objM7386unboximpl2;
        java.lang.String str3;
        jAK jak3;
        jAL jal3;
        DexUserIdentity dexUserIdentity;
        C28603kdr c28603kdr3;
        android.content.Context context3;
        androidx.fragment.app.FragmentManager fragmentManager3;
        final jAL jal4;
        android.content.Context context4;
        final C28603kdr c28603kdr4;
        final jAK jak4;
        final DexUserIdentity dexUserIdentity2;
        final boolean z3;
        final Function1<? super java.lang.Boolean, Unit> function14;
        final C25640jAx c25640jAx3;
        final java.lang.String str4;
        java.lang.Object objM7386unboximpl3;
        final java.lang.String str5;
        final jAF jaf3;
        final androidx.fragment.app.FragmentManager fragmentManager4;
        DappSignArgs dappSignArgs;
        if (continuation instanceof TrackerApiKt$selectTrackerGroupApi$1) {
            trackerApiKt$selectTrackerGroupApi$1 = (TrackerApiKt$selectTrackerGroupApi$1) continuation;
            int i = trackerApiKt$selectTrackerGroupApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerApiKt$selectTrackerGroupApi$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerApiKt$selectTrackerGroupApi$1 = new TrackerApiKt$selectTrackerGroupApi$1(continuation);
            }
        }
        java.lang.Object obj = trackerApiKt$selectTrackerGroupApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerApiKt$selectTrackerGroupApi$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            trackerApiKt$selectTrackerGroupApi$1.L$0 = c28603kdr;
            trackerApiKt$selectTrackerGroupApi$1.L$1 = jal;
            jak2 = jak;
            trackerApiKt$selectTrackerGroupApi$1.L$2 = jak2;
            jaf2 = jaf;
            trackerApiKt$selectTrackerGroupApi$1.L$3 = jaf2;
            c25640jAx2 = c25640jAx;
            trackerApiKt$selectTrackerGroupApi$1.L$4 = c25640jAx2;
            context2 = context;
            trackerApiKt$selectTrackerGroupApi$1.L$5 = context2;
            fragmentManager2 = fragmentManager;
            trackerApiKt$selectTrackerGroupApi$1.L$6 = fragmentManager2;
            trackerApiKt$selectTrackerGroupApi$1.L$7 = str;
            trackerApiKt$selectTrackerGroupApi$1.L$8 = function1;
            trackerApiKt$selectTrackerGroupApi$1.Z$0 = z;
            trackerApiKt$selectTrackerGroupApi$1.label = 1;
            java.lang.Object objOLrzqt = c28586kda.OLrzqt(trackerApiKt$selectTrackerGroupApi$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c28603kdr2 = c28603kdr;
            function12 = function1;
            jal2 = jal;
            z2 = z;
            objM7386unboximpl = objOLrzqt;
            str2 = str;
        } else if (i2 == 1) {
            z2 = trackerApiKt$selectTrackerGroupApi$1.Z$0;
            Function1<? super java.lang.Boolean, Unit> function15 = (Function1) trackerApiKt$selectTrackerGroupApi$1.L$8;
            str2 = (java.lang.String) trackerApiKt$selectTrackerGroupApi$1.L$7;
            androidx.fragment.app.FragmentManager fragmentManager5 = (androidx.fragment.app.FragmentManager) trackerApiKt$selectTrackerGroupApi$1.L$6;
            android.content.Context context5 = (android.content.Context) trackerApiKt$selectTrackerGroupApi$1.L$5;
            C25640jAx c25640jAx4 = (C25640jAx) trackerApiKt$selectTrackerGroupApi$1.L$4;
            jAF jaf4 = (jAF) trackerApiKt$selectTrackerGroupApi$1.L$3;
            jAK jak5 = (jAK) trackerApiKt$selectTrackerGroupApi$1.L$2;
            jal2 = (jAL) trackerApiKt$selectTrackerGroupApi$1.L$1;
            c28603kdr2 = (C28603kdr) trackerApiKt$selectTrackerGroupApi$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            function12 = function15;
            jak2 = jak5;
            fragmentManager2 = fragmentManager5;
            jaf2 = jaf4;
            context2 = context5;
            c25640jAx2 = c25640jAx4;
        } else {
            if (i2 == 2) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                boolean z4 = trackerApiKt$selectTrackerGroupApi$1.Z$0;
                str4 = (java.lang.String) trackerApiKt$selectTrackerGroupApi$1.L$10;
                dexUserIdentity2 = (DexUserIdentity) trackerApiKt$selectTrackerGroupApi$1.L$9;
                Function1<? super java.lang.Boolean, Unit> function16 = (Function1) trackerApiKt$selectTrackerGroupApi$1.L$8;
                java.lang.String str6 = (java.lang.String) trackerApiKt$selectTrackerGroupApi$1.L$7;
                androidx.fragment.app.FragmentManager fragmentManager6 = (androidx.fragment.app.FragmentManager) trackerApiKt$selectTrackerGroupApi$1.L$6;
                android.content.Context context6 = (android.content.Context) trackerApiKt$selectTrackerGroupApi$1.L$5;
                C25640jAx c25640jAx5 = (C25640jAx) trackerApiKt$selectTrackerGroupApi$1.L$4;
                jAF jaf5 = (jAF) trackerApiKt$selectTrackerGroupApi$1.L$3;
                jAK jak6 = (jAK) trackerApiKt$selectTrackerGroupApi$1.L$2;
                jAL jal5 = (jAL) trackerApiKt$selectTrackerGroupApi$1.L$1;
                C28603kdr c28603kdr5 = (C28603kdr) trackerApiKt$selectTrackerGroupApi$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl3 = ((Result) obj).m7386unboximpl();
                fragmentManager4 = fragmentManager6;
                context4 = context6;
                c25640jAx3 = c25640jAx5;
                jaf3 = jaf5;
                str5 = str6;
                jak4 = jak6;
                z3 = z4;
                c28603kdr4 = c28603kdr5;
                function14 = function16;
                jal4 = jal5;
                if (Result.m7383isFailureimpl(objM7386unboximpl3)) {
                    objM7386unboximpl3 = null;
                }
                dappSignArgs = (DappSignArgs) objM7386unboximpl3;
                if (dappSignArgs != null) {
                    return Unit.INSTANCE;
                }
                final android.content.Context context7 = context4;
                ((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class)).EZpvd(context4, dappSignArgs, new Function1() { // from class: o.jAS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return jAT.EZpvd(c28603kdr4, str4, dexUserIdentity2, jal4, jak4, jaf3, c25640jAx3, fragmentManager4, str5, context7, z3, function14, (android.os.Bundle) obj2);
                    }
                }, null);
                return Unit.INSTANCE;
            }
            z2 = trackerApiKt$selectTrackerGroupApi$1.Z$0;
            str3 = (java.lang.String) trackerApiKt$selectTrackerGroupApi$1.L$10;
            DexUserIdentity dexUserIdentity3 = (DexUserIdentity) trackerApiKt$selectTrackerGroupApi$1.L$9;
            function13 = (Function1) trackerApiKt$selectTrackerGroupApi$1.L$8;
            java.lang.String str7 = (java.lang.String) trackerApiKt$selectTrackerGroupApi$1.L$7;
            fragmentManager3 = (androidx.fragment.app.FragmentManager) trackerApiKt$selectTrackerGroupApi$1.L$6;
            context3 = (android.content.Context) trackerApiKt$selectTrackerGroupApi$1.L$5;
            C25640jAx c25640jAx6 = (C25640jAx) trackerApiKt$selectTrackerGroupApi$1.L$4;
            jAF jaf6 = (jAF) trackerApiKt$selectTrackerGroupApi$1.L$3;
            jak3 = (jAK) trackerApiKt$selectTrackerGroupApi$1.L$2;
            jal3 = (jAL) trackerApiKt$selectTrackerGroupApi$1.L$1;
            C28603kdr c28603kdr6 = (C28603kdr) trackerApiKt$selectTrackerGroupApi$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
            dexUserIdentity = dexUserIdentity3;
            str2 = str7;
            c25640jAx2 = c25640jAx6;
            c28603kdr3 = c28603kdr6;
            jaf2 = jaf6;
            java.lang.Object objKWHzl = C56443yFo.KWHzl(false);
            if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                objM7386unboximpl2 = objKWHzl;
            }
            if (((java.lang.Boolean) objM7386unboximpl2).booleanValue()) {
                java.lang.String str8 = str3;
                long jOLrzqt = dexUserIdentity.OLrzqt();
                trackerApiKt$selectTrackerGroupApi$1.L$0 = c28603kdr3;
                trackerApiKt$selectTrackerGroupApi$1.L$1 = jal3;
                trackerApiKt$selectTrackerGroupApi$1.L$2 = jak3;
                trackerApiKt$selectTrackerGroupApi$1.L$3 = jaf2;
                trackerApiKt$selectTrackerGroupApi$1.L$4 = c25640jAx2;
                trackerApiKt$selectTrackerGroupApi$1.L$5 = context3;
                trackerApiKt$selectTrackerGroupApi$1.L$6 = fragmentManager3;
                trackerApiKt$selectTrackerGroupApi$1.L$7 = str2;
                trackerApiKt$selectTrackerGroupApi$1.L$8 = function13;
                trackerApiKt$selectTrackerGroupApi$1.L$9 = dexUserIdentity;
                trackerApiKt$selectTrackerGroupApi$1.L$10 = str8;
                trackerApiKt$selectTrackerGroupApi$1.Z$0 = z2;
                DexUserIdentity dexUserIdentity4 = dexUserIdentity;
                trackerApiKt$selectTrackerGroupApi$1.label = 4;
                java.lang.Object objEZpvd = c28603kdr3.EZpvd(str8, jOLrzqt, trackerApiKt$selectTrackerGroupApi$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                jal4 = jal3;
                context4 = context3;
                c28603kdr4 = c28603kdr3;
                jak4 = jak3;
                dexUserIdentity2 = dexUserIdentity4;
                z3 = z2;
                function14 = function13;
                c25640jAx3 = c25640jAx2;
                str4 = str8;
                objM7386unboximpl3 = objEZpvd;
                str5 = str2;
                jaf3 = jaf2;
                fragmentManager4 = fragmentManager3;
                if (Result.m7383isFailureimpl(objM7386unboximpl3)) {
                }
                dappSignArgs = (DappSignArgs) objM7386unboximpl3;
                if (dappSignArgs != null) {
                }
            } else {
                trackerApiKt$selectTrackerGroupApi$1.L$0 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$1 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$2 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$3 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$4 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$5 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$6 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$7 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$8 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$9 = null;
                trackerApiKt$selectTrackerGroupApi$1.L$10 = null;
                trackerApiKt$selectTrackerGroupApi$1.label = 5;
                if (OLrzqt(jal3, jak3, jaf2, c25640jAx2, fragmentManager3, str3, str2, context3, z2, function13, trackerApiKt$selectTrackerGroupApi$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        DexUserIdentity dexUserIdentity5 = (DexUserIdentity) objM7386unboximpl;
        if (dexUserIdentity5 == null || dexUserIdentity5.KWHzl()) {
            java.lang.String string = context2.getString(C23274hvD.Fragment.UlJrfe);
            Intrinsics.checkNotNullExpressionValue(string, "");
            trackerApiKt$selectTrackerGroupApi$1.L$0 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$1 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$2 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$3 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$4 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$5 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$6 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$7 = null;
            trackerApiKt$selectTrackerGroupApi$1.L$8 = null;
            trackerApiKt$selectTrackerGroupApi$1.label = 2;
            if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$selectTrackerGroupApi$1, 2, null) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        java.lang.String strEZpvd = dexUserIdentity5.EZpvd();
        trackerApiKt$selectTrackerGroupApi$1.L$0 = c28603kdr2;
        trackerApiKt$selectTrackerGroupApi$1.L$1 = jal2;
        trackerApiKt$selectTrackerGroupApi$1.L$2 = jak2;
        trackerApiKt$selectTrackerGroupApi$1.L$3 = jaf2;
        trackerApiKt$selectTrackerGroupApi$1.L$4 = c25640jAx2;
        trackerApiKt$selectTrackerGroupApi$1.L$5 = context2;
        trackerApiKt$selectTrackerGroupApi$1.L$6 = fragmentManager2;
        trackerApiKt$selectTrackerGroupApi$1.L$7 = str2;
        trackerApiKt$selectTrackerGroupApi$1.L$8 = function12;
        trackerApiKt$selectTrackerGroupApi$1.L$9 = dexUserIdentity5;
        trackerApiKt$selectTrackerGroupApi$1.L$10 = strEZpvd;
        trackerApiKt$selectTrackerGroupApi$1.Z$0 = z2;
        trackerApiKt$selectTrackerGroupApi$1.label = 3;
        java.lang.Object objCopydefault2 = c28603kdr2.copydefault(strEZpvd, trackerApiKt$selectTrackerGroupApi$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        function13 = function12;
        objM7386unboximpl2 = objCopydefault2;
        str3 = strEZpvd;
        C28603kdr c28603kdr7 = c28603kdr2;
        jak3 = jak2;
        jal3 = jal2;
        dexUserIdentity = dexUserIdentity5;
        c28603kdr3 = c28603kdr7;
        androidx.fragment.app.FragmentManager fragmentManager7 = fragmentManager2;
        context3 = context2;
        fragmentManager3 = fragmentManager7;
        java.lang.Object objKWHzl2 = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
        }
        if (((java.lang.Boolean) objM7386unboximpl2).booleanValue()) {
        }
    }

    public static final Unit EZpvd(C28603kdr c28603kdr, java.lang.String str, DexUserIdentity dexUserIdentity, jAL jal, jAK jak, jAF jaf, C25640jAx c25640jAx, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str2, android.content.Context context, boolean z, Function1 function1, android.os.Bundle bundle) {
        C25389ivm.safeLaunch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TrackerApiKt$selectTrackerGroupApi$2$1(c28603kdr, str, dexUserIdentity, bundle, jal, jak, jaf, c25640jAx, fragmentManager, str2, context, z, function1, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(jAL jal, jAK jak, jAF jaf, C25640jAx c25640jAx, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str2, android.content.Context context, boolean z, Function1<? super java.lang.Boolean, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrackerApiKt$toggleFollowStatus$1 trackerApiKt$toggleFollowStatus$1;
        jAF jaf2;
        C25640jAx c25640jAx2;
        java.lang.String str3;
        androidx.fragment.app.FragmentManager fragmentManager2;
        android.content.Context context2;
        Function1<? super java.lang.Boolean, Unit> function12;
        jAK jak2;
        boolean z2;
        jAL jal2;
        java.lang.Object objAhwBna;
        int i;
        java.lang.Object objEZpvd;
        final C25640jAx c25640jAx3;
        final java.lang.String str4;
        final androidx.fragment.app.FragmentManager fragmentManager3;
        final Function1<? super java.lang.Boolean, Unit> function13;
        final jAK jak3;
        final jAL jal3;
        java.lang.String str5;
        java.lang.Object obj;
        android.content.Context context3;
        java.lang.String str6 = str2;
        if (continuation instanceof TrackerApiKt$toggleFollowStatus$1) {
            trackerApiKt$toggleFollowStatus$1 = (TrackerApiKt$toggleFollowStatus$1) continuation;
            int i2 = trackerApiKt$toggleFollowStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackerApiKt$toggleFollowStatus$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackerApiKt$toggleFollowStatus$1 = new TrackerApiKt$toggleFollowStatus$1(continuation);
            }
        }
        java.lang.Object obj2 = trackerApiKt$toggleFollowStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (trackerApiKt$toggleFollowStatus$1.label) {
            case 0:
                C56391yDq.AEQbTJ(obj2);
                trackerApiKt$toggleFollowStatus$1.L$0 = jal;
                trackerApiKt$toggleFollowStatus$1.L$1 = jak;
                jaf2 = jaf;
                trackerApiKt$toggleFollowStatus$1.L$2 = jaf2;
                c25640jAx2 = c25640jAx;
                trackerApiKt$toggleFollowStatus$1.L$3 = c25640jAx2;
                str3 = str;
                trackerApiKt$toggleFollowStatus$1.L$4 = str3;
                fragmentManager2 = fragmentManager;
                trackerApiKt$toggleFollowStatus$1.L$5 = fragmentManager2;
                trackerApiKt$toggleFollowStatus$1.L$6 = str6;
                context2 = context;
                trackerApiKt$toggleFollowStatus$1.L$7 = context2;
                function12 = function1;
                trackerApiKt$toggleFollowStatus$1.L$8 = function12;
                trackerApiKt$toggleFollowStatus$1.Z$0 = z;
                trackerApiKt$toggleFollowStatus$1.label = 1;
                java.lang.Object objCopydefault2 = jak.copydefault(str6, trackerApiKt$toggleFollowStatus$1);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                jak2 = jak;
                z2 = z;
                jal2 = jal;
                objAhwBna = objCopydefault2;
                if (Result.m7380exceptionOrNullimpl(objAhwBna) != null) {
                    objAhwBna = yDY.AhwBna();
                }
                i = !((java.util.List) objAhwBna).isEmpty() ? 1 : 0;
                trackerApiKt$toggleFollowStatus$1.L$0 = jal2;
                trackerApiKt$toggleFollowStatus$1.L$1 = jak2;
                trackerApiKt$toggleFollowStatus$1.L$2 = jaf2;
                trackerApiKt$toggleFollowStatus$1.L$3 = c25640jAx2;
                trackerApiKt$toggleFollowStatus$1.L$4 = str3;
                trackerApiKt$toggleFollowStatus$1.L$5 = fragmentManager2;
                trackerApiKt$toggleFollowStatus$1.L$6 = str6;
                trackerApiKt$toggleFollowStatus$1.L$7 = context2;
                trackerApiKt$toggleFollowStatus$1.L$8 = function12;
                trackerApiKt$toggleFollowStatus$1.Z$0 = z2;
                trackerApiKt$toggleFollowStatus$1.I$0 = i;
                trackerApiKt$toggleFollowStatus$1.label = 2;
                objEZpvd = jal2.EZpvd(str3, trackerApiKt$toggleFollowStatus$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                c25640jAx3 = c25640jAx2;
                str4 = str3;
                fragmentManager3 = fragmentManager2;
                function13 = function12;
                jak3 = jak2;
                jal3 = jal2;
                str5 = str6;
                obj = objEZpvd;
                context3 = context2;
                if (Result.m7380exceptionOrNullimpl(obj) == null) {
                    if (z2) {
                        java.lang.String string = context3.getString(C23274hvD.Fragment.RbMRq);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        trackerApiKt$toggleFollowStatus$1.L$0 = null;
                        trackerApiKt$toggleFollowStatus$1.L$1 = null;
                        trackerApiKt$toggleFollowStatus$1.L$2 = null;
                        trackerApiKt$toggleFollowStatus$1.L$3 = null;
                        trackerApiKt$toggleFollowStatus$1.L$4 = null;
                        trackerApiKt$toggleFollowStatus$1.L$5 = null;
                        trackerApiKt$toggleFollowStatus$1.L$6 = null;
                        trackerApiKt$toggleFollowStatus$1.L$7 = null;
                        trackerApiKt$toggleFollowStatus$1.L$8 = null;
                        trackerApiKt$toggleFollowStatus$1.label = 3;
                        if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$toggleFollowStatus$1, 2, null) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                final java.util.List list = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C56443yFo.AEQbTJ(C33129mqd.AhwBna(C56443yFo.AEQbTJ(((CommonGroupUiModel) it.next()).OLrzqt()))));
                }
                if (CollectionsKt___CollectionsKt.RlQdEF(arrayList) > 600) {
                    if (z2) {
                        java.lang.String string2 = context3.getString(C23274hvD.Fragment.mayLaunchUrl);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        trackerApiKt$toggleFollowStatus$1.L$0 = null;
                        trackerApiKt$toggleFollowStatus$1.L$1 = null;
                        trackerApiKt$toggleFollowStatus$1.L$2 = null;
                        trackerApiKt$toggleFollowStatus$1.L$3 = null;
                        trackerApiKt$toggleFollowStatus$1.L$4 = null;
                        trackerApiKt$toggleFollowStatus$1.L$5 = null;
                        trackerApiKt$toggleFollowStatus$1.L$6 = null;
                        trackerApiKt$toggleFollowStatus$1.L$7 = null;
                        trackerApiKt$toggleFollowStatus$1.L$8 = null;
                        trackerApiKt$toggleFollowStatus$1.label = 4;
                        if (C25352ivB.showToastSafe$default(string2, null, trackerApiKt$toggleFollowStatus$1, 2, null) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 0) {
                    InterfaceC25657jBn.StateListAnimator stateListAnimator = InterfaceC25657jBn.StateListAnimator.KWHzl;
                    java.util.List listAhwBna = yDY.AhwBna();
                    trackerApiKt$toggleFollowStatus$1.L$0 = null;
                    trackerApiKt$toggleFollowStatus$1.L$1 = null;
                    trackerApiKt$toggleFollowStatus$1.L$2 = null;
                    trackerApiKt$toggleFollowStatus$1.L$3 = null;
                    trackerApiKt$toggleFollowStatus$1.L$4 = null;
                    trackerApiKt$toggleFollowStatus$1.L$5 = null;
                    trackerApiKt$toggleFollowStatus$1.L$6 = null;
                    trackerApiKt$toggleFollowStatus$1.L$7 = null;
                    trackerApiKt$toggleFollowStatus$1.L$8 = null;
                    trackerApiKt$toggleFollowStatus$1.label = 5;
                    if (copydefault(jaf2, c25640jAx3, stateListAnimator, str5, (java.util.List<java.lang.Integer>) listAhwBna, z2, context3, function13, trackerApiKt$toggleFollowStatus$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                final CommonGroupUiModel commonGroupUiModel = (CommonGroupUiModel) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (commonGroupUiModel != null) {
                    InterfaceC25657jBn.ActionBar actionBar = InterfaceC25657jBn.ActionBar.copydefault;
                    java.util.List listEZpvd = C56402yEa.EZpvd(C56443yFo.AEQbTJ(commonGroupUiModel.KWHzl()));
                    final android.content.Context context4 = context3;
                    final jAF jaf3 = jaf2;
                    final java.lang.String str7 = str5;
                    Function1 function14 = new Function1() { // from class: o.jAV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return jAT.copydefault(function13, commonGroupUiModel, context4, list, jal3, jak3, jaf3, c25640jAx3, fragmentManager3, str4, str7, ((java.lang.Boolean) obj3).booleanValue());
                        }
                    };
                    trackerApiKt$toggleFollowStatus$1.L$0 = null;
                    trackerApiKt$toggleFollowStatus$1.L$1 = null;
                    trackerApiKt$toggleFollowStatus$1.L$2 = null;
                    trackerApiKt$toggleFollowStatus$1.L$3 = null;
                    trackerApiKt$toggleFollowStatus$1.L$4 = null;
                    trackerApiKt$toggleFollowStatus$1.L$5 = null;
                    trackerApiKt$toggleFollowStatus$1.L$6 = null;
                    trackerApiKt$toggleFollowStatus$1.L$7 = null;
                    trackerApiKt$toggleFollowStatus$1.L$8 = null;
                    trackerApiKt$toggleFollowStatus$1.label = 6;
                    if (copydefault(jaf2, actionBar, str5, (java.util.List<java.lang.Integer>) listEZpvd, z2, context3, (Function1<? super java.lang.Boolean, Unit>) function14, trackerApiKt$toggleFollowStatus$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                z2 = trackerApiKt$toggleFollowStatus$1.Z$0;
                Function1<? super java.lang.Boolean, Unit> function15 = (Function1) trackerApiKt$toggleFollowStatus$1.L$8;
                android.content.Context context5 = (android.content.Context) trackerApiKt$toggleFollowStatus$1.L$7;
                java.lang.String str8 = (java.lang.String) trackerApiKt$toggleFollowStatus$1.L$6;
                androidx.fragment.app.FragmentManager fragmentManager4 = (androidx.fragment.app.FragmentManager) trackerApiKt$toggleFollowStatus$1.L$5;
                java.lang.String str9 = (java.lang.String) trackerApiKt$toggleFollowStatus$1.L$4;
                C25640jAx c25640jAx4 = (C25640jAx) trackerApiKt$toggleFollowStatus$1.L$3;
                jAF jaf4 = (jAF) trackerApiKt$toggleFollowStatus$1.L$2;
                jak2 = (jAK) trackerApiKt$toggleFollowStatus$1.L$1;
                jal2 = (jAL) trackerApiKt$toggleFollowStatus$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                objAhwBna = ((Result) obj2).m7386unboximpl();
                function12 = function15;
                str6 = str8;
                c25640jAx2 = c25640jAx4;
                context2 = context5;
                jaf2 = jaf4;
                fragmentManager2 = fragmentManager4;
                str3 = str9;
                if (Result.m7380exceptionOrNullimpl(objAhwBna) != null) {
                }
                i = !((java.util.List) objAhwBna).isEmpty() ? 1 : 0;
                trackerApiKt$toggleFollowStatus$1.L$0 = jal2;
                trackerApiKt$toggleFollowStatus$1.L$1 = jak2;
                trackerApiKt$toggleFollowStatus$1.L$2 = jaf2;
                trackerApiKt$toggleFollowStatus$1.L$3 = c25640jAx2;
                trackerApiKt$toggleFollowStatus$1.L$4 = str3;
                trackerApiKt$toggleFollowStatus$1.L$5 = fragmentManager2;
                trackerApiKt$toggleFollowStatus$1.L$6 = str6;
                trackerApiKt$toggleFollowStatus$1.L$7 = context2;
                trackerApiKt$toggleFollowStatus$1.L$8 = function12;
                trackerApiKt$toggleFollowStatus$1.Z$0 = z2;
                trackerApiKt$toggleFollowStatus$1.I$0 = i;
                trackerApiKt$toggleFollowStatus$1.label = 2;
                objEZpvd = jal2.EZpvd(str3, trackerApiKt$toggleFollowStatus$1);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 2:
                int i3 = trackerApiKt$toggleFollowStatus$1.I$0;
                boolean z3 = trackerApiKt$toggleFollowStatus$1.Z$0;
                Function1<? super java.lang.Boolean, Unit> function16 = (Function1) trackerApiKt$toggleFollowStatus$1.L$8;
                context3 = (android.content.Context) trackerApiKt$toggleFollowStatus$1.L$7;
                str5 = (java.lang.String) trackerApiKt$toggleFollowStatus$1.L$6;
                androidx.fragment.app.FragmentManager fragmentManager5 = (androidx.fragment.app.FragmentManager) trackerApiKt$toggleFollowStatus$1.L$5;
                java.lang.String str10 = (java.lang.String) trackerApiKt$toggleFollowStatus$1.L$4;
                C25640jAx c25640jAx5 = (C25640jAx) trackerApiKt$toggleFollowStatus$1.L$3;
                jAF jaf5 = (jAF) trackerApiKt$toggleFollowStatus$1.L$2;
                jAK jak4 = (jAK) trackerApiKt$toggleFollowStatus$1.L$1;
                jAL jal4 = (jAL) trackerApiKt$toggleFollowStatus$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                java.lang.Object objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                function13 = function16;
                fragmentManager3 = fragmentManager5;
                str4 = str10;
                c25640jAx3 = c25640jAx5;
                jaf2 = jaf5;
                jak3 = jak4;
                jal3 = jal4;
                i = i3;
                z2 = z3;
                obj = objM7386unboximpl;
                if (Result.m7380exceptionOrNullimpl(obj) == null) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj2);
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj2);
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj2);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj2);
                return Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Unit copydefault(final Function1 function1, CommonGroupUiModel commonGroupUiModel, final android.content.Context context, java.util.List list, final jAL jal, final jAK jak, final jAF jaf, final C25640jAx c25640jAx, final androidx.fragment.app.FragmentManager fragmentManager, final java.lang.String str, final java.lang.String str2, boolean z) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.getTag, C56423yEv.EZpvd(C56390yDp.OLrzqt("group", commonGroupUiModel.EZpvd())));
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        c55097xdX.setTitle(strCopydefault);
        c55097xdX.setState(2);
        c55097xdX.setCloseBtnShow(false);
        if (list.size() > 1) {
            c55097xdX.OLrzqt(context.getString(C23274hvD.Fragment.pauseLocationServices), new Function0() { // from class: o.jAY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jAT.AEQbTJ(jal, jak, jaf, c25640jAx, fragmentManager, str, str2, context, function1);
                }
            });
        }
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jAL jal, jAK jak, jAF jaf, C25640jAx c25640jAx, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, android.content.Context context, Function1 function1) {
        C25389ivm.safeLaunch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TrackerApiKt$toggleFollowStatus$3$1$1$1(jal, jak, jaf, c25640jAx, fragmentManager, str, str2, context, function1, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(jAL jal, jAK jak, jAF jaf, C25640jAx c25640jAx, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, android.content.Context context, boolean z, Function1<? super java.lang.Boolean, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrackerApiKt$checkFollow$1 trackerApiKt$checkFollow$1;
        C25640jAx c25640jAx2;
        androidx.fragment.app.FragmentManager fragmentManager2;
        java.lang.String str3;
        android.content.Context context2;
        Function1<? super java.lang.Boolean, Unit> function12;
        java.lang.Object objM7386unboximpl;
        jAL jal2;
        boolean z2;
        jAF jaf2;
        java.lang.Object objAhwBna;
        java.util.List list;
        java.lang.Object objEZpvd;
        java.lang.String str4;
        boolean z3;
        java.lang.Object objM7386unboximpl2;
        androidx.fragment.app.FragmentManager fragmentManager3;
        android.content.Context context3;
        java.lang.String str5 = str2;
        if (continuation instanceof TrackerApiKt$checkFollow$1) {
            trackerApiKt$checkFollow$1 = (TrackerApiKt$checkFollow$1) continuation;
            int i = trackerApiKt$checkFollow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerApiKt$checkFollow$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerApiKt$checkFollow$1 = new TrackerApiKt$checkFollow$1(continuation);
            }
        }
        java.lang.Object obj = trackerApiKt$checkFollow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (trackerApiKt$checkFollow$1.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                trackerApiKt$checkFollow$1.L$0 = jal;
                trackerApiKt$checkFollow$1.L$1 = jaf;
                c25640jAx2 = c25640jAx;
                trackerApiKt$checkFollow$1.L$2 = c25640jAx2;
                fragmentManager2 = fragmentManager;
                trackerApiKt$checkFollow$1.L$3 = fragmentManager2;
                str3 = str;
                trackerApiKt$checkFollow$1.L$4 = str3;
                trackerApiKt$checkFollow$1.L$5 = str5;
                context2 = context;
                trackerApiKt$checkFollow$1.L$6 = context2;
                function12 = function1;
                trackerApiKt$checkFollow$1.L$7 = function12;
                trackerApiKt$checkFollow$1.Z$0 = z;
                trackerApiKt$checkFollow$1.label = 1;
                java.lang.Object objCopydefault2 = jak.copydefault(str5, trackerApiKt$checkFollow$1);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objCopydefault2;
                jal2 = jal;
                z2 = z;
                jaf2 = jaf;
                objAhwBna = objM7386unboximpl;
                if (Result.m7380exceptionOrNullimpl(objAhwBna) != null) {
                    objAhwBna = yDY.AhwBna();
                }
                list = (java.util.List) objAhwBna;
                trackerApiKt$checkFollow$1.L$0 = jaf2;
                trackerApiKt$checkFollow$1.L$1 = c25640jAx2;
                trackerApiKt$checkFollow$1.L$2 = fragmentManager2;
                trackerApiKt$checkFollow$1.L$3 = str5;
                trackerApiKt$checkFollow$1.L$4 = context2;
                trackerApiKt$checkFollow$1.L$5 = function12;
                trackerApiKt$checkFollow$1.L$6 = list;
                trackerApiKt$checkFollow$1.L$7 = null;
                trackerApiKt$checkFollow$1.Z$0 = z2;
                trackerApiKt$checkFollow$1.label = 2;
                objEZpvd = jal2.EZpvd(str3, trackerApiKt$checkFollow$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                str4 = str5;
                z3 = z2;
                objM7386unboximpl2 = objEZpvd;
                android.content.Context context4 = context2;
                fragmentManager3 = fragmentManager2;
                context3 = context4;
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl2) != null) {
                    java.lang.Iterable<CommonGroupUiModel> iterable = (java.lang.Iterable) objM7386unboximpl2;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    for (CommonGroupUiModel commonGroupUiModel : iterable) {
                        arrayList.add(CommonGroupUiModel.copy$default(commonGroupUiModel, 0, null, 0, 0, 0, list.contains(C56443yFo.AEQbTJ(commonGroupUiModel.KWHzl())), false, 95, null));
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C56443yFo.AEQbTJ(C33129mqd.AhwBna(C56443yFo.AEQbTJ(((CommonGroupUiModel) it.next()).OLrzqt()))));
                    }
                    if (CollectionsKt___CollectionsKt.RlQdEF(arrayList2) > 600) {
                        if (z3) {
                            java.lang.String string = context3.getString(C23274hvD.Fragment.mayLaunchUrl);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            trackerApiKt$checkFollow$1.L$0 = null;
                            trackerApiKt$checkFollow$1.L$1 = null;
                            trackerApiKt$checkFollow$1.L$2 = null;
                            trackerApiKt$checkFollow$1.L$3 = null;
                            trackerApiKt$checkFollow$1.L$4 = null;
                            trackerApiKt$checkFollow$1.L$5 = null;
                            trackerApiKt$checkFollow$1.L$6 = null;
                            trackerApiKt$checkFollow$1.label = 4;
                            if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$checkFollow$1, 2, null) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (!list.isEmpty()) {
                        InterfaceC25657jBn.StateListAnimator stateListAnimator = InterfaceC25657jBn.StateListAnimator.KWHzl;
                        java.util.List listAhwBna = yDY.AhwBna();
                        trackerApiKt$checkFollow$1.L$0 = null;
                        trackerApiKt$checkFollow$1.L$1 = null;
                        trackerApiKt$checkFollow$1.L$2 = null;
                        trackerApiKt$checkFollow$1.L$3 = null;
                        trackerApiKt$checkFollow$1.L$4 = null;
                        trackerApiKt$checkFollow$1.L$5 = null;
                        trackerApiKt$checkFollow$1.L$6 = null;
                        trackerApiKt$checkFollow$1.label = 5;
                        if (copydefault(jaf2, c25640jAx2, stateListAnimator, str4, (java.util.List<java.lang.Integer>) listAhwBna, z3, context3, function12, trackerApiKt$checkFollow$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    if (arrayList.size() <= 1) {
                        InterfaceC25657jBn.ActionBar actionBar = InterfaceC25657jBn.ActionBar.copydefault;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                        java.util.Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(C56443yFo.AEQbTJ(((CommonGroupUiModel) it2.next()).KWHzl()));
                        }
                        trackerApiKt$checkFollow$1.L$0 = null;
                        trackerApiKt$checkFollow$1.L$1 = null;
                        trackerApiKt$checkFollow$1.L$2 = null;
                        trackerApiKt$checkFollow$1.L$3 = null;
                        trackerApiKt$checkFollow$1.L$4 = null;
                        trackerApiKt$checkFollow$1.L$5 = null;
                        trackerApiKt$checkFollow$1.L$6 = null;
                        trackerApiKt$checkFollow$1.label = 6;
                        if (copydefault(jaf2, c25640jAx2, actionBar, str4, arrayList3, z3, context3, function12, trackerApiKt$checkFollow$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    final java.lang.String str6 = str4;
                    final jAF jaf3 = jaf2;
                    final C25640jAx c25640jAx3 = c25640jAx2;
                    final boolean z4 = z3;
                    final android.content.Context context5 = context3;
                    final Function1<? super java.lang.Boolean, Unit> function13 = function12;
                    C25655jBl.Companion.OLrzqt(new TrackerGroupSelectionParams(GroupSelectionMode.BULK, arrayList, str6, null, false, true, 24, null), new yHO() { // from class: o.jAR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHO
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return jAT.copydefault(jaf3, c25640jAx3, str6, z4, context5, function13, (InterfaceC25657jBn) obj2, (TrackerGroupSelectionParams) obj3, (java.util.List) obj4);
                        }
                    }).show(fragmentManager3);
                    return Unit.INSTANCE;
                }
                if (z3) {
                    java.lang.String string2 = context3.getString(C23274hvD.Fragment.RbMRq);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    trackerApiKt$checkFollow$1.L$0 = null;
                    trackerApiKt$checkFollow$1.L$1 = null;
                    trackerApiKt$checkFollow$1.L$2 = null;
                    trackerApiKt$checkFollow$1.L$3 = null;
                    trackerApiKt$checkFollow$1.L$4 = null;
                    trackerApiKt$checkFollow$1.L$5 = null;
                    trackerApiKt$checkFollow$1.L$6 = null;
                    trackerApiKt$checkFollow$1.label = 3;
                    if (C25352ivB.showToastSafe$default(string2, null, trackerApiKt$checkFollow$1, 2, null) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                boolean z5 = trackerApiKt$checkFollow$1.Z$0;
                Function1<? super java.lang.Boolean, Unit> function14 = (Function1) trackerApiKt$checkFollow$1.L$7;
                android.content.Context context6 = (android.content.Context) trackerApiKt$checkFollow$1.L$6;
                java.lang.String str7 = (java.lang.String) trackerApiKt$checkFollow$1.L$5;
                str3 = (java.lang.String) trackerApiKt$checkFollow$1.L$4;
                androidx.fragment.app.FragmentManager fragmentManager4 = (androidx.fragment.app.FragmentManager) trackerApiKt$checkFollow$1.L$3;
                C25640jAx c25640jAx4 = (C25640jAx) trackerApiKt$checkFollow$1.L$2;
                jaf2 = (jAF) trackerApiKt$checkFollow$1.L$1;
                jal2 = (jAL) trackerApiKt$checkFollow$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                z2 = z5;
                str5 = str7;
                fragmentManager2 = fragmentManager4;
                context2 = context6;
                c25640jAx2 = c25640jAx4;
                function12 = function14;
                objAhwBna = objM7386unboximpl;
                if (Result.m7380exceptionOrNullimpl(objAhwBna) != null) {
                }
                list = (java.util.List) objAhwBna;
                trackerApiKt$checkFollow$1.L$0 = jaf2;
                trackerApiKt$checkFollow$1.L$1 = c25640jAx2;
                trackerApiKt$checkFollow$1.L$2 = fragmentManager2;
                trackerApiKt$checkFollow$1.L$3 = str5;
                trackerApiKt$checkFollow$1.L$4 = context2;
                trackerApiKt$checkFollow$1.L$5 = function12;
                trackerApiKt$checkFollow$1.L$6 = list;
                trackerApiKt$checkFollow$1.L$7 = null;
                trackerApiKt$checkFollow$1.Z$0 = z2;
                trackerApiKt$checkFollow$1.label = 2;
                objEZpvd = jal2.EZpvd(str3, trackerApiKt$checkFollow$1);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 2:
                z3 = trackerApiKt$checkFollow$1.Z$0;
                list = (java.util.List) trackerApiKt$checkFollow$1.L$6;
                Function1<? super java.lang.Boolean, Unit> function15 = (Function1) trackerApiKt$checkFollow$1.L$5;
                context3 = (android.content.Context) trackerApiKt$checkFollow$1.L$4;
                str4 = (java.lang.String) trackerApiKt$checkFollow$1.L$3;
                fragmentManager3 = (androidx.fragment.app.FragmentManager) trackerApiKt$checkFollow$1.L$2;
                C25640jAx c25640jAx5 = (C25640jAx) trackerApiKt$checkFollow$1.L$1;
                jaf2 = (jAF) trackerApiKt$checkFollow$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                function12 = function15;
                c25640jAx2 = c25640jAx5;
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl2) != null) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Unit copydefault(jAF jaf, C25640jAx c25640jAx, java.lang.String str, boolean z, android.content.Context context, Function1 function1, InterfaceC25657jBn interfaceC25657jBn, TrackerGroupSelectionParams trackerGroupSelectionParams, java.util.List list) {
        Intrinsics.checkNotNullParameter(interfaceC25657jBn, "");
        Intrinsics.checkNotNullParameter(trackerGroupSelectionParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TrackerApiKt$checkFollow$4$1(jaf, c25640jAx, interfaceC25657jBn, str, list, z, context, function1, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(jAF jaf, C25640jAx c25640jAx, InterfaceC25657jBn interfaceC25657jBn, java.lang.String str, java.util.List<java.lang.Integer> list, boolean z, android.content.Context context, Function1<? super java.lang.Boolean, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrackerApiKt$confirmIfUnfollow$1 trackerApiKt$confirmIfUnfollow$1;
        java.lang.Object objCopydefault;
        if (continuation instanceof TrackerApiKt$confirmIfUnfollow$1) {
            trackerApiKt$confirmIfUnfollow$1 = (TrackerApiKt$confirmIfUnfollow$1) continuation;
            int i = trackerApiKt$confirmIfUnfollow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerApiKt$confirmIfUnfollow$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerApiKt$confirmIfUnfollow$1 = new TrackerApiKt$confirmIfUnfollow$1(continuation);
            }
        }
        java.lang.Object obj = trackerApiKt$confirmIfUnfollow$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = trackerApiKt$confirmIfUnfollow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            trackerApiKt$confirmIfUnfollow$1.L$0 = jaf;
            trackerApiKt$confirmIfUnfollow$1.L$1 = interfaceC25657jBn;
            trackerApiKt$confirmIfUnfollow$1.L$2 = str;
            trackerApiKt$confirmIfUnfollow$1.L$3 = list;
            trackerApiKt$confirmIfUnfollow$1.L$4 = context;
            trackerApiKt$confirmIfUnfollow$1.L$5 = function1;
            trackerApiKt$confirmIfUnfollow$1.Z$0 = z;
            trackerApiKt$confirmIfUnfollow$1.label = 1;
            objCopydefault = c25640jAx.copydefault(str, trackerApiKt$confirmIfUnfollow$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            z = trackerApiKt$confirmIfUnfollow$1.Z$0;
            function1 = (Function1) trackerApiKt$confirmIfUnfollow$1.L$5;
            context = (android.content.Context) trackerApiKt$confirmIfUnfollow$1.L$4;
            list = (java.util.List) trackerApiKt$confirmIfUnfollow$1.L$3;
            str = (java.lang.String) trackerApiKt$confirmIfUnfollow$1.L$2;
            interfaceC25657jBn = (InterfaceC25657jBn) trackerApiKt$confirmIfUnfollow$1.L$1;
            jaf = (jAF) trackerApiKt$confirmIfUnfollow$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        if (((AddressTrackerNotification) objCopydefault) == null) {
            if (z) {
                java.lang.String string = context.getString(C23274hvD.Fragment.RbMRq);
                Intrinsics.checkNotNullExpressionValue(string, "");
                trackerApiKt$confirmIfUnfollow$1.L$0 = null;
                trackerApiKt$confirmIfUnfollow$1.L$1 = null;
                trackerApiKt$confirmIfUnfollow$1.L$2 = null;
                trackerApiKt$confirmIfUnfollow$1.L$3 = null;
                trackerApiKt$confirmIfUnfollow$1.L$4 = null;
                trackerApiKt$confirmIfUnfollow$1.L$5 = null;
                trackerApiKt$confirmIfUnfollow$1.label = 2;
                if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$confirmIfUnfollow$1, 2, null) == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return Unit.INSTANCE;
        }
        trackerApiKt$confirmIfUnfollow$1.L$0 = null;
        trackerApiKt$confirmIfUnfollow$1.L$1 = null;
        trackerApiKt$confirmIfUnfollow$1.L$2 = null;
        trackerApiKt$confirmIfUnfollow$1.L$3 = null;
        trackerApiKt$confirmIfUnfollow$1.L$4 = null;
        trackerApiKt$confirmIfUnfollow$1.L$5 = null;
        trackerApiKt$confirmIfUnfollow$1.label = 3;
        if (copydefault(jaf, interfaceC25657jBn, str, list, z, context, function1, trackerApiKt$confirmIfUnfollow$1) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(jAF jaf, InterfaceC25657jBn interfaceC25657jBn, java.lang.String str, java.util.List<java.lang.Integer> list, boolean z, android.content.Context context, Function1<? super java.lang.Boolean, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrackerApiKt$handleFollow$1 trackerApiKt$handleFollow$1;
        Function1<? super java.lang.Boolean, Unit> function12;
        java.lang.Object objAEQbTJ;
        InterfaceC25657jBn interfaceC25657jBn2;
        android.content.Context context2;
        boolean z2;
        android.content.Context context3;
        java.lang.String string;
        if (continuation instanceof TrackerApiKt$handleFollow$1) {
            trackerApiKt$handleFollow$1 = (TrackerApiKt$handleFollow$1) continuation;
            int i = trackerApiKt$handleFollow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerApiKt$handleFollow$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerApiKt$handleFollow$1 = new TrackerApiKt$handleFollow$1(continuation);
            }
        }
        java.lang.Object obj = trackerApiKt$handleFollow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerApiKt$handleFollow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            trackerApiKt$handleFollow$1.L$0 = interfaceC25657jBn;
            trackerApiKt$handleFollow$1.L$1 = context;
            function12 = function1;
            trackerApiKt$handleFollow$1.L$2 = function12;
            trackerApiKt$handleFollow$1.Z$0 = z;
            trackerApiKt$handleFollow$1.label = 1;
            objAEQbTJ = jaf.AEQbTJ(str, list, trackerApiKt$handleFollow$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            interfaceC25657jBn2 = interfaceC25657jBn;
            context2 = context;
            z2 = z;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                z2 = trackerApiKt$handleFollow$1.Z$0;
                objAEQbTJ = trackerApiKt$handleFollow$1.L$1;
                context3 = (android.content.Context) trackerApiKt$handleFollow$1.L$0;
                C56391yDq.AEQbTJ(obj);
                context2 = context3;
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null && z2) {
                    string = context2.getString(C23274hvD.Fragment.RbMRq);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    trackerApiKt$handleFollow$1.L$0 = objAEQbTJ;
                    trackerApiKt$handleFollow$1.L$1 = null;
                    trackerApiKt$handleFollow$1.L$2 = null;
                    trackerApiKt$handleFollow$1.label = 3;
                    if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$handleFollow$1, 2, null) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            z2 = trackerApiKt$handleFollow$1.Z$0;
            Function1<? super java.lang.Boolean, Unit> function13 = (Function1) trackerApiKt$handleFollow$1.L$2;
            android.content.Context context4 = (android.content.Context) trackerApiKt$handleFollow$1.L$1;
            interfaceC25657jBn2 = (InterfaceC25657jBn) trackerApiKt$handleFollow$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            context2 = context4;
            function12 = function13;
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            MainCoroutineDispatcher main = Dispatchers.getMain();
            TrackerApiKt$handleFollow$2$1 trackerApiKt$handleFollow$2$1 = new TrackerApiKt$handleFollow$2$1((jAC) objAEQbTJ, function12, interfaceC25657jBn2, z2, context2, null);
            trackerApiKt$handleFollow$1.L$0 = context2;
            trackerApiKt$handleFollow$1.L$1 = objAEQbTJ;
            trackerApiKt$handleFollow$1.L$2 = null;
            trackerApiKt$handleFollow$1.Z$0 = z2;
            trackerApiKt$handleFollow$1.label = 2;
            if (BuildersKt.withContext(main, trackerApiKt$handleFollow$2$1, trackerApiKt$handleFollow$1) == objCopydefault) {
                return objCopydefault;
            }
            context3 = context2;
            context2 = context3;
        }
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            string = context2.getString(C23274hvD.Fragment.RbMRq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            trackerApiKt$handleFollow$1.L$0 = objAEQbTJ;
            trackerApiKt$handleFollow$1.L$1 = null;
            trackerApiKt$handleFollow$1.L$2 = null;
            trackerApiKt$handleFollow$1.label = 3;
            if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$handleFollow$1, 2, null) == objCopydefault) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super java.lang.String, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TrackerApiKt$editTrackerAlias$1 trackerApiKt$editTrackerAlias$1;
        androidx.fragment.app.FragmentManager fragmentManager2;
        java.lang.String str3;
        C28603kdr c28603kdr2;
        java.lang.Object objM7386unboximpl;
        java.lang.String str4;
        android.content.Context context2;
        Function1<? super java.lang.String, Unit> function12;
        DexUserIdentity dexUserIdentity;
        java.lang.Object objM7386unboximpl2;
        Function1<? super java.lang.String, Unit> function13;
        java.lang.String str5;
        java.lang.String str6;
        androidx.fragment.app.FragmentManager fragmentManager3;
        java.lang.String str7;
        java.lang.Object objEZpvd;
        java.lang.String str8;
        DexUserIdentity dexUserIdentity2;
        Function1<? super java.lang.String, Unit> function14;
        java.lang.String str9;
        DappSignArgs dappSignArgs;
        if (continuation instanceof TrackerApiKt$editTrackerAlias$1) {
            trackerApiKt$editTrackerAlias$1 = (TrackerApiKt$editTrackerAlias$1) continuation;
            int i = trackerApiKt$editTrackerAlias$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerApiKt$editTrackerAlias$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerApiKt$editTrackerAlias$1 = new TrackerApiKt$editTrackerAlias$1(continuation);
            }
        }
        java.lang.Object obj = trackerApiKt$editTrackerAlias$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerApiKt$editTrackerAlias$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            trackerApiKt$editTrackerAlias$1.L$0 = c28603kdr;
            trackerApiKt$editTrackerAlias$1.L$1 = context;
            fragmentManager2 = fragmentManager;
            trackerApiKt$editTrackerAlias$1.L$2 = fragmentManager2;
            str3 = str;
            trackerApiKt$editTrackerAlias$1.L$3 = str3;
            trackerApiKt$editTrackerAlias$1.L$4 = str2;
            trackerApiKt$editTrackerAlias$1.L$5 = function1;
            trackerApiKt$editTrackerAlias$1.label = 1;
            java.lang.Object objOLrzqt = c28586kda.OLrzqt(trackerApiKt$editTrackerAlias$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c28603kdr2 = c28603kdr;
            objM7386unboximpl = objOLrzqt;
            str4 = str2;
            context2 = context;
            function12 = function1;
        } else if (i2 == 1) {
            function12 = (Function1) trackerApiKt$editTrackerAlias$1.L$5;
            str4 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$4;
            java.lang.String str10 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$3;
            androidx.fragment.app.FragmentManager fragmentManager4 = (androidx.fragment.app.FragmentManager) trackerApiKt$editTrackerAlias$1.L$2;
            context2 = (android.content.Context) trackerApiKt$editTrackerAlias$1.L$1;
            c28603kdr2 = (C28603kdr) trackerApiKt$editTrackerAlias$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            str3 = str10;
            fragmentManager2 = fragmentManager4;
        } else {
            if (i2 == 2) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str8 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$7;
                dexUserIdentity2 = (DexUserIdentity) trackerApiKt$editTrackerAlias$1.L$6;
                function14 = (Function1) trackerApiKt$editTrackerAlias$1.L$5;
                str9 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$4;
                java.lang.String str11 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$3;
                androidx.fragment.app.FragmentManager fragmentManager5 = (androidx.fragment.app.FragmentManager) trackerApiKt$editTrackerAlias$1.L$2;
                android.content.Context context3 = (android.content.Context) trackerApiKt$editTrackerAlias$1.L$1;
                C28603kdr c28603kdr3 = (C28603kdr) trackerApiKt$editTrackerAlias$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                c28603kdr2 = c28603kdr3;
                fragmentManager3 = fragmentManager5;
                context2 = context3;
                str7 = str11;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                    objEZpvd = null;
                }
                dappSignArgs = (DappSignArgs) objEZpvd;
                if (dappSignArgs != null) {
                    return Unit.INSTANCE;
                }
                final C28603kdr c28603kdr4 = c28603kdr2;
                final java.lang.String str12 = str8;
                final DexUserIdentity dexUserIdentity3 = dexUserIdentity2;
                final androidx.fragment.app.FragmentManager fragmentManager6 = fragmentManager3;
                final java.lang.String str13 = str7;
                final java.lang.String str14 = str9;
                final Function1<? super java.lang.String, Unit> function15 = function14;
                ((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class)).EZpvd(context2, dappSignArgs, new Function1() { // from class: o.jAQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return jAT.copydefault(c28603kdr4, str12, dexUserIdentity3, fragmentManager6, str13, str14, function15, (android.os.Bundle) obj2);
                    }
                }, null);
                return Unit.INSTANCE;
            }
            str5 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$7;
            dexUserIdentity = (DexUserIdentity) trackerApiKt$editTrackerAlias$1.L$6;
            function13 = (Function1) trackerApiKt$editTrackerAlias$1.L$5;
            str6 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$4;
            str7 = (java.lang.String) trackerApiKt$editTrackerAlias$1.L$3;
            fragmentManager3 = (androidx.fragment.app.FragmentManager) trackerApiKt$editTrackerAlias$1.L$2;
            context2 = (android.content.Context) trackerApiKt$editTrackerAlias$1.L$1;
            c28603kdr2 = (C28603kdr) trackerApiKt$editTrackerAlias$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
            java.lang.Object objKWHzl = C56443yFo.KWHzl(false);
            if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                objM7386unboximpl2 = objKWHzl;
            }
            if (((java.lang.Boolean) objM7386unboximpl2).booleanValue()) {
                long jOLrzqt = dexUserIdentity.OLrzqt();
                trackerApiKt$editTrackerAlias$1.L$0 = c28603kdr2;
                trackerApiKt$editTrackerAlias$1.L$1 = context2;
                trackerApiKt$editTrackerAlias$1.L$2 = fragmentManager3;
                trackerApiKt$editTrackerAlias$1.L$3 = str7;
                trackerApiKt$editTrackerAlias$1.L$4 = str6;
                trackerApiKt$editTrackerAlias$1.L$5 = function13;
                trackerApiKt$editTrackerAlias$1.L$6 = dexUserIdentity;
                trackerApiKt$editTrackerAlias$1.L$7 = str5;
                trackerApiKt$editTrackerAlias$1.label = 4;
                objEZpvd = c28603kdr2.EZpvd(str5, jOLrzqt, trackerApiKt$editTrackerAlias$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str8 = str5;
                dexUserIdentity2 = dexUserIdentity;
                function14 = function13;
                str9 = str6;
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                dappSignArgs = (DappSignArgs) objEZpvd;
                if (dappSignArgs != null) {
                }
            } else {
                copydefault(fragmentManager3, str7, str6, function13);
                return Unit.INSTANCE;
            }
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        DexUserIdentity dexUserIdentity4 = (DexUserIdentity) objM7386unboximpl;
        if (dexUserIdentity4 == null || dexUserIdentity4.KWHzl()) {
            java.lang.String string = context2.getString(C23274hvD.Fragment.UlJrfe);
            Intrinsics.checkNotNullExpressionValue(string, "");
            trackerApiKt$editTrackerAlias$1.L$0 = null;
            trackerApiKt$editTrackerAlias$1.L$1 = null;
            trackerApiKt$editTrackerAlias$1.L$2 = null;
            trackerApiKt$editTrackerAlias$1.L$3 = null;
            trackerApiKt$editTrackerAlias$1.L$4 = null;
            trackerApiKt$editTrackerAlias$1.L$5 = null;
            trackerApiKt$editTrackerAlias$1.label = 2;
            if (C25352ivB.showToastSafe$default(string, null, trackerApiKt$editTrackerAlias$1, 2, null) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        java.lang.String strEZpvd = dexUserIdentity4.EZpvd();
        trackerApiKt$editTrackerAlias$1.L$0 = c28603kdr2;
        trackerApiKt$editTrackerAlias$1.L$1 = context2;
        trackerApiKt$editTrackerAlias$1.L$2 = fragmentManager2;
        trackerApiKt$editTrackerAlias$1.L$3 = str3;
        trackerApiKt$editTrackerAlias$1.L$4 = str4;
        trackerApiKt$editTrackerAlias$1.L$5 = function12;
        trackerApiKt$editTrackerAlias$1.L$6 = dexUserIdentity4;
        trackerApiKt$editTrackerAlias$1.L$7 = strEZpvd;
        trackerApiKt$editTrackerAlias$1.label = 3;
        java.lang.Object objCopydefault2 = c28603kdr2.copydefault(strEZpvd, trackerApiKt$editTrackerAlias$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        dexUserIdentity = dexUserIdentity4;
        objM7386unboximpl2 = objCopydefault2;
        java.lang.String str15 = str4;
        function13 = function12;
        str5 = strEZpvd;
        str6 = str15;
        java.lang.String str16 = str3;
        fragmentManager3 = fragmentManager2;
        str7 = str16;
        java.lang.Object objKWHzl2 = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
        }
        if (((java.lang.Boolean) objM7386unboximpl2).booleanValue()) {
        }
    }

    public static final Unit copydefault(C28603kdr c28603kdr, java.lang.String str, DexUserIdentity dexUserIdentity, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str2, java.lang.String str3, Function1 function1, android.os.Bundle bundle) {
        C25389ivm.safeLaunch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TrackerApiKt$editTrackerAlias$2$1(c28603kdr, str, dexUserIdentity, bundle, fragmentManager, str2, str3, function1, null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void editAlias$default(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        copydefault(fragmentManager, str, str2, function1);
    }

    public static final void copydefault(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, Function1<? super java.lang.String, Unit> function1) {
        C25633jAq.Companion.AEQbTJ(str, str2, function1).show(fragmentManager);
    }
}
