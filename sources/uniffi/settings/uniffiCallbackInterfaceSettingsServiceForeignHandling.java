package uniffi.settings;

import com.sun.jna.Pointer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.BmO;
import o.BoN;
import o.C4774Bqn;
import o.C60173zxj;
import o.InterfaceC4736Bpc;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureCompleteVoid;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultRustBuffer;
import uniffi.UniffiForeignFutureResultVoid;
import uniffi.UniffiRustCallStatus;
import uniffi.settings.UniffiVTableCallbackInterfaceSettingsServiceForeignHandling;
import uniffi.settings.uniffiCallbackInterfaceSettingsServiceForeignHandling;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceSettingsServiceForeignHandling {
    public static final uniffiCallbackInterfaceSettingsServiceForeignHandling INSTANCE = new uniffiCallbackInterfaceSettingsServiceForeignHandling();
    public static UniffiVTableCallbackInterfaceSettingsServiceForeignHandling.UniffiByValue vtable = new UniffiVTableCallbackInterfaceSettingsServiceForeignHandling.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getSettingsFromRemote.INSTANCE, getSettingsFromCache.INSTANCE, getCurrencyListFromRemote.INSTANCE, getCurrencyListFromCache.INSTANCE, updateCurrencyList.INSTANCE, getCurrencyInfoWithIsoCode.INSTANCE, getCurrencyPref.INSTANCE, getFundUnit.INSTANCE, updateUserSettings.INSTANCE, setRiseFallColor.INSTANCE, setColorAppearance.INSTANCE, setColorPalette.INSTANCE, setRiseFallCycle.INSTANCE, setCurrencyPref.INSTANCE, setFundUnit.INSTANCE, setUserLanguage.INSTANCE, registerSettingsEventCallback.INSTANCE);
    public static final int $stable = 8;

    public static final class getSettingsFromRemote implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod0 {
        public static final int $stable = 0;
        public static final getSettingsFromRemote INSTANCE = new getSettingsFromRemote();

        private getSettingsFromRemote() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod0
        public void callback(long j, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$getSettingsFromRemote$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_getsettingsfromremote_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$getSettingsFromRemote$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$getSettingsFromRemote$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Bra
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getSettingsFromRemote.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (C4774Bqn) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_getsettingsfromremote_callback_makecall_1, new Function1() { // from class: o.Brc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getSettingsFromRemote.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, C4774Bqn c4774Bqn) {
            Intrinsics.checkNotNullParameter(c4774Bqn, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeUserSettings.INSTANCE.lower2((Object) c4774Bqn), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceSettingsServiceForeignHandling() {
    }

    public static final class getSettingsFromCache implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod1 {
        public static final int $stable = 0;
        public static final getSettingsFromCache INSTANCE = new getSettingsFromCache();

        private getSettingsFromCache() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod1
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Brd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4736BpcCopydefault.AEQbTJ();
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bre
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getSettingsFromCache.callback$lambda$1(rustBuffer, (C4774Bqn) obj);
                }
            };
            RustBuffer rustBuffer2 = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, C4774Bqn c4774Bqn) {
            Intrinsics.checkNotNullParameter(c4774Bqn, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeUserSettings.INSTANCE.lower2((Object) c4774Bqn));
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrencyListFromRemote implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod2 {
        public static final int $stable = 0;
        public static final getCurrencyListFromRemote INSTANCE = new getCurrencyListFromRemote();

        private getCurrencyListFromRemote() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod2
        public void callback(long j, byte b, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_getcurrencylistfromremote_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), b, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.BqS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getCurrencyListFromRemote.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (java.util.List) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_getcurrencylistfromremote_callback_makecall_1, new Function1() { // from class: o.BqX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getCurrencyListFromRemote.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), FfiConverterSequenceTypeCurrencyModel.INSTANCE.lower2((Object) list), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrencyListFromCache implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod3 {
        public static final int $stable = 0;
        public static final getCurrencyListFromCache INSTANCE = new getCurrencyListFromCache();

        private getCurrencyListFromCache() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod3
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BqQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4736BpcCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BqT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getCurrencyListFromCache.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceTypeCurrencyModel.INSTANCE.lower2((Object) list));
            return Unit.INSTANCE;
        }
    }

    public static final class updateCurrencyList implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod4 {
        public static final int $stable = 0;
        public static final updateCurrencyList INSTANCE = new updateCurrencyList();

        private updateCurrencyList() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod4
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Brx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.updateCurrencyList.callback$lambda$0(interfaceC4736BpcCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bru
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.updateCurrencyList.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC4736Bpc interfaceC4736Bpc, RustBuffer.ByValue byValue) {
            interfaceC4736Bpc.KWHzl((List) FfiConverterSequenceTypeCurrencyModel.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrencyInfoWithIsoCode implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod5 {
        public static final int $stable = 0;
        public static final getCurrencyInfoWithIsoCode INSTANCE = new getCurrencyInfoWithIsoCode();

        private getCurrencyInfoWithIsoCode() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BqR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getCurrencyInfoWithIsoCode.callback$lambda$0(interfaceC4736BpcCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BqU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getCurrencyInfoWithIsoCode.callback$lambda$1(rustBuffer, (BmO) obj);
                }
            };
            RustBuffer rustBuffer2 = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BmO callback$lambda$0(InterfaceC4736Bpc interfaceC4736Bpc, RustBuffer.ByValue byValue) {
            return interfaceC4736Bpc.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BmO bmO) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCurrencyModel.INSTANCE.lower2(bmO));
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrencyPref implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod6 {
        public static final int $stable = 0;
        public static final getCurrencyPref INSTANCE = new getCurrencyPref();

        private getCurrencyPref() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod6
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BqV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4736BpcCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BqZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getCurrencyPref.callback$lambda$1(rustBuffer, (BmO) obj);
                }
            };
            RustBuffer rustBuffer2 = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BmO bmO) {
            Intrinsics.checkNotNullParameter(bmO, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeCurrencyModel.INSTANCE.lower2((Object) bmO));
            return Unit.INSTANCE;
        }
    }

    public static final class getFundUnit implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod7 {
        public static final int $stable = 0;
        public static final getFundUnit INSTANCE = new getFundUnit();

        private getFundUnit() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod7
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BqW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4736BpcCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BqY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.getFundUnit.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class updateUserSettings implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod8 {
        public static final int $stable = 0;
        public static final updateUserSettings INSTANCE = new updateUserSettings();

        private updateUserSettings() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod8
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Brv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.updateUserSettings.callback$lambda$0(interfaceC4736BpcCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Brw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.updateUserSettings.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof SettingsException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeSettingsError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC4736Bpc interfaceC4736Bpc, RustBuffer.ByValue byValue) {
            interfaceC4736Bpc.EZpvd((C4774Bqn) FfiConverterTypeUserSettings.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class setRiseFallColor implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod9 {
        public static final int $stable = 0;
        public static final setRiseFallColor INSTANCE = new setRiseFallColor();

        private setRiseFallColor() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod9
        public void callback(long j, int i, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_setrisefallcolor_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), i, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallColor$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Bro
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setRiseFallColor.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_setrisefallcolor_callback_makecall_1, new Function1() { // from class: o.Brt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setRiseFallColor.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class setColorAppearance implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod10 {
        public static final int $stable = 0;
        public static final setColorAppearance INSTANCE = new setColorAppearance();

        private setColorAppearance() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod10
        public void callback(long j, int i, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$setColorAppearance$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_setcolorappearance_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$setColorAppearance$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), i, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$setColorAppearance$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Brj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setColorAppearance.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_setcolorappearance_callback_makecall_1, new Function1() { // from class: o.Brh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setColorAppearance.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class setColorPalette implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod11 {
        public static final int $stable = 0;
        public static final setColorPalette INSTANCE = new setColorPalette();

        private setColorPalette() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod11
        public void callback(long j, int i, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$setColorPalette$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_setcolorpalette_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$setColorPalette$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), i, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$setColorPalette$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Brg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setColorPalette.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_setcolorpalette_callback_makecall_1, new Function1() { // from class: o.Bri
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setColorPalette.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class setRiseFallCycle implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod12 {
        public static final int $stable = 0;
        public static final setRiseFallCycle INSTANCE = new setRiseFallCycle();

        private setRiseFallCycle() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod12
        public void callback(long j, int i, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallCycle$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_setrisefallcycle_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallCycle$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), i, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$setRiseFallCycle$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Brq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setRiseFallCycle.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_setrisefallcycle_callback_makecall_1, new Function1() { // from class: o.Brr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setRiseFallCycle.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class setCurrencyPref implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod13 {
        public static final int $stable = 0;
        public static final setCurrencyPref INSTANCE = new setCurrencyPref();

        private setCurrencyPref() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod13
        public void callback(long j, int i, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$setCurrencyPref$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_setcurrencypref_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$setCurrencyPref$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), i, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$setCurrencyPref$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Brl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setCurrencyPref.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_setcurrencypref_callback_makecall_1, new Function1() { // from class: o.Brm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setCurrencyPref.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class setFundUnit implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod14 {
        public static final int $stable = 0;
        public static final setFundUnit INSTANCE = new setFundUnit();

        private setFundUnit() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod14
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$setFundUnit$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_setfundunit_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$setFundUnit$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$setFundUnit$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Brn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setFundUnit.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_setfundunit_callback_makecall_1, new Function1() { // from class: o.Brk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setFundUnit.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class setUserLanguage implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod15 {
        public static final int $stable = 0;
        public static final setUserLanguage INSTANCE = new setUserLanguage();

        private setUserLanguage() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod15
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$makeCall$1 unifficallbackinterfacesettingsserviceforeignhandling_setuserlanguage_callback_makecall_1 = new uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$makeCall$1(FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSettingsServiceForeignHandling$setUserLanguage$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Brs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setUserLanguage.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacesettingsserviceforeignhandling_setuserlanguage_callback_makecall_1, new Function1() { // from class: o.Brp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.setUserLanguage.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class registerSettingsEventCallback implements UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod16 {
        public static final int $stable = 0;
        public static final registerSettingsEventCallback INSTANCE = new registerSettingsEventCallback();

        private registerSettingsEventCallback() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod16
        public void callback(long j, final long j2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4736Bpc interfaceC4736BpcCopydefault = FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Brb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.registerSettingsEventCallback.callback$lambda$0(interfaceC4736BpcCopydefault, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Brf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSettingsServiceForeignHandling.registerSettingsEventCallback.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC4736Bpc interfaceC4736Bpc, long j) {
            interfaceC4736Bpc.EZpvd(FfiConverterTypeSettingsNotificationBridgingCallback.INSTANCE.lift(j));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_settings_fn_init_callback_vtable_settingsserviceforeignhandling(vtable);
    }
}
