package o;

import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.util.SupplierState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.HC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HC<SuperBuilder, SuperBuilt> {
    public final Function1<SuperBuilt, SuperBuilt> AEQbTJ;
    public SuperBuilt EZpvd;
    public InterfaceC5185Hz<? extends SuperBuilder, ? extends SuperBuilt> KWHzl;
    public Function1<? super SuperBuilder, Unit> OLrzqt;
    public final InterfaceC5185Hz<SuperBuilder, SuperBuilt> copydefault;
    public Function0<? extends SuperBuilt> djBIcL;
    public final Function1<SuperBuilt, Function1<SuperBuilder, Unit>> gEmmrt;
    public SupplierState valueOf;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupplierState.values().length];
            try {
                iArr[SupplierState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SupplierState.EXPLICIT_INSTANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<SuperBuilt> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.Hz<? extends SuperBuilder, ? extends SuperBuilt> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super SuperBuilt, ? extends kotlin.jvm.functions.Function1<? super SuperBuilder, kotlin.Unit>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super SuperBuilt, ? extends SuperBuilt> */
    /* JADX WARN: Multi-variable type inference failed */
    public HC(@NotNull InterfaceC5185Hz<? extends SuperBuilder, ? extends SuperBuilt> interfaceC5185Hz, @NotNull Function1<? super SuperBuilt, ? extends Function1<? super SuperBuilder, Unit>> function1, @NotNull Function1<? super SuperBuilt, ? extends SuperBuilt> function12) {
        Intrinsics.checkNotNullParameter(interfaceC5185Hz, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = interfaceC5185Hz;
        this.gEmmrt = function1;
        this.AEQbTJ = function12;
        this.OLrzqt = new Function1<SuperBuilder, Unit>() { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$configApplicator$1
            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SuperBuilder superbuilder) {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }
        };
        this.KWHzl = interfaceC5185Hz;
        this.valueOf = SupplierState.NOT_INITIALIZED;
        this.djBIcL = new Function0<SuperBuilt>(this) { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$supply$1
            final /* synthetic */ HC<SuperBuilder, SuperBuilt> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final SuperBuilt invoke() {
                return (SuperBuilt) this.this$0.AEQbTJ.invoke(this.this$0.KWHzl.OLrzqt(new Function1<SuperBuilder, Unit>() { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$supply$1.1
                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SuperBuilder superbuilder) {
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        invoke2(obj);
                        return Unit.INSTANCE;
                    }
                }));
            }
        };
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.Hz)
  (r2v0 kotlin.jvm.functions.Function1)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0004: SGET  A[WRAPPED] (LINE:32) aws.smithy.kotlin.runtime.util.DslBuilderProperty$1.INSTANCE aws.smithy.kotlin.runtime.util.DslBuilderProperty$1) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(o.Hz<? extends SuperBuilder, ? extends SuperBuilt>, kotlin.jvm.functions.Function1<? super SuperBuilt, ? extends kotlin.jvm.functions.Function1<? super SuperBuilder, kotlin.Unit>>, kotlin.jvm.functions.Function1<? super SuperBuilt, ? extends SuperBuilt>):void (m)] (LINE:29) call: o.HC.<init>(o.Hz, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ HC(InterfaceC5185Hz interfaceC5185Hz, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5185Hz, function1, (i & 4) != 0 ? new Function1<SuperBuilt, SuperBuilt>() { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$1
            @Override // kotlin.jvm.functions.Function1
            public final SuperBuilt invoke(SuperBuilt superbuilt) {
                return superbuilt;
            }
        } : function12);
    }

    public final void OLrzqt(final SuperBuilt superbuilt) {
        SupplierState supplierState;
        Function0<SuperBuilt> function0;
        Function1<SuperBuilder, Unit> function1Invoke;
        if (Application.AEQbTJ[this.valueOf.ordinal()] == 1) {
            supplierState = SupplierState.INITIALIZED;
        } else {
            supplierState = SupplierState.EXPLICIT_INSTANCE;
        }
        this.valueOf = supplierState;
        this.EZpvd = superbuilt;
        if (superbuilt == null) {
            this.KWHzl = this.copydefault;
            function0 = new Function0<SuperBuilt>(this) { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$instance$1
                final /* synthetic */ HC<SuperBuilder, SuperBuilt> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final SuperBuilt invoke() {
                    return (SuperBuilt) this.this$0.AEQbTJ.invoke(this.this$0.KWHzl.OLrzqt(new Function1<SuperBuilder, Unit>() { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$instance$1.1
                        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SuperBuilder superbuilder) {
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke2(obj);
                            return Unit.INSTANCE;
                        }
                    }));
                }
            };
        } else {
            function0 = new Function0<SuperBuilt>() { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$instance$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final SuperBuilt invoke() {
                    return superbuilt;
                }
            };
        }
        this.djBIcL = function0;
        if (superbuilt == null || (function1Invoke = this.gEmmrt.invoke(superbuilt)) == null) {
            function1Invoke = new Function1<SuperBuilder, Unit>() { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$instance$3
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SuperBuilder superbuilder) {
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }
            };
        }
        this.OLrzqt = function1Invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.Hz<? extends SubBuilder extends SuperBuilder, ? extends SubBuilt extends SuperBuilt> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <SubBuilder extends SuperBuilder, SubBuilt extends SuperBuilt> void OLrzqt(@NotNull final InterfaceC5185Hz<? extends SubBuilder, ? extends SubBuilt> interfaceC5185Hz, @NotNull final Function1<? super SubBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC5185Hz, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (Application.AEQbTJ[this.valueOf.ordinal()] == 2) {
            throw new ClientException("An explicit instance is already configured and its configuration cannot be modified");
        }
        this.valueOf = SupplierState.EXPLICIT_CONFIG;
        this.KWHzl = interfaceC5185Hz;
        final Function1<? super SuperBuilder, Unit> function12 = this.OLrzqt;
        this.OLrzqt = new Function1<SuperBuilder, Unit>() { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$dsl$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super SuperBuilder, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super SubBuilder, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SuperBuilder superbuilder) {
                function12.invoke(superbuilder);
                function1.invoke((SubBuilder) superbuilder);
            }
        };
        this.djBIcL = new Function0<SuperBuilt>(this) { // from class: aws.smithy.kotlin.runtime.util.DslBuilderProperty$dsl$2
            final /* synthetic */ HC<SuperBuilder, SuperBuilt> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.Hz<? extends SubBuilder, ? extends SubBuilt> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function0
            public final SuperBuilt invoke() {
                return (SuperBuilt) this.this$0.AEQbTJ.invoke(interfaceC5185Hz.OLrzqt((Function1<? super SubBuilder, Unit>) this.this$0.OLrzqt));
            }
        };
    }
}
