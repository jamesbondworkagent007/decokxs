package o;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.features.address_tracker.domain.GetTrackingAddressListUseCase$getAllTrackingAddresses$1;
import com.okinc.business.market.features.address_tracker.domain.GetTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker.domain.GetTrackingAddressListUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.GetTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C25653jBj AEQbTJ;
    public final jAN EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public jAO(@NotNull C25653jBj c25653jBj, @NotNull jAN jan, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25653jBj, "");
        Intrinsics.checkNotNullParameter(jan, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c25653jBj;
        this.EZpvd = jan;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8631invokehUnOzRk$default(jAO jao, java.lang.String str, int i, AddressTrackerSortType addressTrackerSortType, java.lang.Integer num, boolean z, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        return jao.AEQbTJ(str, i, addressTrackerSortType, num, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull AddressTrackerSortType addressTrackerSortType, java.lang.Integer num, boolean z, @NotNull Continuation<? super Result<jAX>> continuation) throws java.lang.Throwable {
        GetTrackingAddressListUseCase$invoke$1 getTrackingAddressListUseCase$invoke$1;
        if (continuation instanceof GetTrackingAddressListUseCase$invoke$1) {
            getTrackingAddressListUseCase$invoke$1 = (GetTrackingAddressListUseCase$invoke$1) continuation;
            int i2 = getTrackingAddressListUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getTrackingAddressListUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getTrackingAddressListUseCase$invoke$1 = new GetTrackingAddressListUseCase$invoke$1(this, continuation);
            }
        }
        GetTrackingAddressListUseCase$invoke$1 getTrackingAddressListUseCase$invoke$12 = getTrackingAddressListUseCase$invoke$1;
        java.lang.Object objWithContext = getTrackingAddressListUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getTrackingAddressListUseCase$invoke$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 getTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 = new GetTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(null, this, str, num, i, addressTrackerSortType, z);
            getTrackingAddressListUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1, getTrackingAddressListUseCase$invoke$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
        GetTrackingAddressListUseCase$getAllTrackingAddresses$1 getTrackingAddressListUseCase$getAllTrackingAddresses$1;
        if (continuation instanceof GetTrackingAddressListUseCase$getAllTrackingAddresses$1) {
            getTrackingAddressListUseCase$getAllTrackingAddresses$1 = (GetTrackingAddressListUseCase$getAllTrackingAddresses$1) continuation;
            int i = getTrackingAddressListUseCase$getAllTrackingAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrackingAddressListUseCase$getAllTrackingAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrackingAddressListUseCase$getAllTrackingAddresses$1 = new GetTrackingAddressListUseCase$getAllTrackingAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTrackingAddressListUseCase$getAllTrackingAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrackingAddressListUseCase$getAllTrackingAddresses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1 getTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1 = new GetTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1(null, this, str);
            getTrackingAddressListUseCase$getAllTrackingAddresses$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1, getTrackingAddressListUseCase$getAllTrackingAddresses$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jAO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
