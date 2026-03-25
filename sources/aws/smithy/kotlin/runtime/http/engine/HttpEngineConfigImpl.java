package aws.smithy.kotlin.runtime.http.engine;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AI;
import o.C56444yFp;
import o.InterfaceC3232Ai;
import o.InterfaceC3338Ak;
import o.InterfaceC3972Aw;
import o.InterfaceC4078Ay;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpEngineConfigImpl implements InterfaceC3338Ak {
    public final InterfaceC3972Aw KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Aw) A[MD:(o.Aw):void (m)] call: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl.<init>(o.Aw):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HttpEngineConfigImpl(InterfaceC3972Aw interfaceC3972Aw, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3972Aw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC3338Ak
    public InterfaceC3972Aw djBIcL() {
        return this.KWHzl;
    }

    public HttpEngineConfigImpl(InterfaceC3972Aw interfaceC3972Aw) {
        this.KWHzl = interfaceC3972Aw;
    }

    public static final class Activity implements InterfaceC3338Ak.StateListAnimator {
        public InterfaceC3972Aw EZpvd;
        public Function1<? super InterfaceC4078Ay.ActionBar, Unit> OLrzqt = new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$configApplicator$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                Intrinsics.checkNotNullParameter(actionBar, "");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                invoke2(actionBar);
                return Unit.INSTANCE;
            }
        };
        public Function1<? super Function1<? super InterfaceC4078Ay.ActionBar, Unit>, ? extends InterfaceC3972Aw> AEQbTJ = HttpEngineConfigImpl$BuilderImpl$engineConstructor$1.INSTANCE;
        public Function0<? extends InterfaceC3972Aw> copydefault = new Function0<InterfaceC3972Aw>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$engineSupplier$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC3972Aw invoke() {
                return AI.KWHzl((InterfaceC3972Aw) this.this$0.AEQbTJ.invoke(new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$engineSupplier$1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                }));
            }
        };
        public SupplierState KWHzl = SupplierState.NOT_INITIALIZED;

        /* JADX INFO: renamed from: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$Activity$Activity, reason: collision with other inner class name */
        public final /* synthetic */ class C0165Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SupplierState.values().length];
                try {
                    iArr[SupplierState.NOT_INITIALIZED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SupplierState.EXPLICIT_ENGINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        public void copydefault(final InterfaceC3972Aw interfaceC3972Aw) {
            SupplierState supplierState;
            Function0<InterfaceC3972Aw> function0;
            Function1<InterfaceC4078Ay.ActionBar, Unit> function1OLrzqt;
            InterfaceC4078Ay interfaceC4078AyOLrzqt;
            if (C0165Activity.OLrzqt[this.KWHzl.ordinal()] == 1) {
                supplierState = SupplierState.INITIALIZED;
            } else {
                supplierState = SupplierState.EXPLICIT_ENGINE;
            }
            this.KWHzl = supplierState;
            this.EZpvd = interfaceC3972Aw;
            if (interfaceC3972Aw == null) {
                this.AEQbTJ = HttpEngineConfigImpl$BuilderImpl$httpClient$1.INSTANCE;
                function0 = new Function0<InterfaceC3972Aw>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$httpClient$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final InterfaceC3972Aw invoke() {
                        return AI.KWHzl((InterfaceC3972Aw) this.this$0.AEQbTJ.invoke(new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$httpClient$2.1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                                Intrinsics.checkNotNullParameter(actionBar, "");
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                                invoke2(actionBar);
                                return Unit.INSTANCE;
                            }
                        }));
                    }
                };
            } else {
                function0 = new Function0<InterfaceC3972Aw>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$httpClient$3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final InterfaceC3972Aw invoke() {
                        return interfaceC3972Aw;
                    }
                };
            }
            this.copydefault = function0;
            if (interfaceC3972Aw == null || (interfaceC4078AyOLrzqt = interfaceC3972Aw.OLrzqt()) == null || (function1OLrzqt = interfaceC4078AyOLrzqt.OLrzqt()) == null) {
                function1OLrzqt = new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$httpClient$4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                };
            }
            this.OLrzqt = function1OLrzqt;
        }

        @Override // o.InterfaceC3338Ak.StateListAnimator
        public void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            EZpvd(null, function1);
        }

        @Override // o.InterfaceC3338Ak.StateListAnimator
        public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
            Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
            Intrinsics.checkNotNullParameter(function1, "");
            EZpvd(interfaceC3232Ai, function1);
        }

        public final <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void EZpvd(InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, final Function1<? super B, Unit> function1) {
            if (C0165Activity.OLrzqt[this.KWHzl.ordinal()] == 2) {
                throw new ClientException("Engine configuration cannot be given after an explicit engine instance has already been set");
            }
            this.KWHzl = SupplierState.EXPLICIT_CONFIG;
            if (interfaceC3232Ai != null) {
                this.AEQbTJ = interfaceC3232Ai.AEQbTJ();
            }
            final Function1<? super InterfaceC4078Ay.ActionBar, Unit> function12 = this.OLrzqt;
            this.OLrzqt = new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$httpClientImpl$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.Ay$ActionBar, kotlin.Unit> */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super B, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                    function12.invoke(actionBar);
                    function1.invoke((B) actionBar);
                }
            };
            this.copydefault = new Function0<InterfaceC3972Aw>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl$BuilderImpl$httpClientImpl$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final InterfaceC3972Aw invoke() {
                    return AI.KWHzl((InterfaceC3972Aw) this.this$0.AEQbTJ.invoke(this.this$0.OLrzqt));
                }
            };
        }

        public InterfaceC3338Ak EZpvd() {
            return new HttpEngineConfigImpl(this.copydefault.invoke(), null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SupplierState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SupplierState[] $VALUES;
        public static final SupplierState NOT_INITIALIZED = new SupplierState("NOT_INITIALIZED", 0);
        public static final SupplierState INITIALIZED = new SupplierState("INITIALIZED", 1);
        public static final SupplierState EXPLICIT_CONFIG = new SupplierState("EXPLICIT_CONFIG", 2);
        public static final SupplierState EXPLICIT_ENGINE = new SupplierState("EXPLICIT_ENGINE", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SupplierState[] $values() {
            return new SupplierState[]{NOT_INITIALIZED, INITIALIZED, EXPLICIT_CONFIG, EXPLICIT_ENGINE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SupplierState> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static SupplierState valueOf(String str) {
            return (SupplierState) Enum.valueOf(SupplierState.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static SupplierState[] values() {
            return (SupplierState[]) $VALUES.clone();
        }

        private SupplierState(String str, int i) {
        }

        static {
            SupplierState[] supplierStateArr$values = $values();
            $VALUES = supplierStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(supplierStateArr$values);
        }
    }
}
