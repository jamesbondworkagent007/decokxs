package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5163Hd;
import o.DB;
import o.DI;
import o.DL;
import o.DM;
import o.DN;
import o.DP;
import o.DS;
import o.DU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DL {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final java.lang.String AYXKKw;
    public final DS AhwBna;
    public final DU DbNXlk;
    public final java.lang.String EZpvd;
    public final C5166Hg KWHzl;
    public final DB OLrzqt;
    public final java.lang.String copydefault;
    public final DN djBIcL;
    public final int gEmmrt;
    public final DI valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DI), (r2v0 o.DB), (r3v0 int), (r4v0 o.DS), (r5v0 o.DN), (r6v0 o.DU), (r7v0 o.Hg) A[MD:(o.DI, o.DB, int, o.DS, o.DN, o.DU, o.Hg):void (m)] call: o.DL.<init>(o.DI, o.DB, int, o.DS, o.DN, o.DU, o.Hg):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DL(DI di, DB db, int i, DS ds, DN dn, DU du, C5166Hg c5166Hg, DefaultConstructorMarker defaultConstructorMarker) {
        this(di, db, i, ds, dn, du, c5166Hg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DS AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DI AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5166Hg EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DB OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DN copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DU djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.EZpvd;
    }

    public DL(DI di, DB db, int i, DS ds, DN dn, DU du, C5166Hg c5166Hg) {
        this.valueOf = di;
        this.OLrzqt = db;
        this.gEmmrt = i;
        this.AhwBna = ds;
        this.djBIcL = dn;
        this.DbNXlk = du;
        this.KWHzl = c5166Hg;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(db);
        if (i != di.OLrzqt()) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(i);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.copydefault = string;
        java.lang.String str = "Given port " + i + " is not in required range [1, 65535]";
        if (1 > i || i >= 65536) {
            try {
                throw new java.lang.IllegalArgumentException(str.toString());
            } catch (java.lang.Exception unused) {
                InterfaceC5079Dx interfaceC5079DxEZpvd = C52481wN.EZpvd.EZpvd();
                if (interfaceC5079DxEZpvd != null) {
                    interfaceC5079DxEZpvd.OLrzqt("aws.smithy.kotlin.runtime.net.url.Url->init()->" + str);
                }
            }
        }
        kotlin.Pair pairAEQbTJ = AEQbTJ.AEQbTJ(this.valueOf, this.OLrzqt, this.gEmmrt, this.AhwBna, this.djBIcL, this.DbNXlk, this.KWHzl);
        this.EZpvd = (java.lang.String) pairAEQbTJ.getFirst();
        this.AYXKKw = (java.lang.String) pairAEQbTJ.getSecond();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final DL EZpvd(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.KWHzl();
        }

        public static /* synthetic */ DL parse$default(StateListAnimator stateListAnimator, java.lang.String str, DM dm, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                dm = DM.KWHzl.copydefault();
            }
            return stateListAnimator.EZpvd(str, dm);
        }

        public final DL EZpvd(@NotNull final java.lang.String str, @NotNull final DM dm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dm, "");
            try {
                return DL.AEQbTJ.EZpvd(new Function1<Application, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$Companion$parse$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull final DL.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        final C5163Hd c5163Hd = new C5163Hd(str);
                        c5163Hd.AEQbTJ(new String[]{"://"}, new Function1<String, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$Companion$parse$1.1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                invoke2(str2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull String str2) {
                                Intrinsics.checkNotNullParameter(str2, "");
                                application.EZpvd(DI.EZpvd.OLrzqt(str2));
                            }
                        });
                        c5163Hd.OLrzqt(new String[]{"@"}, new Function1<String, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$Companion$parse$1.2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                invoke2(str2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull String str2) {
                                Intrinsics.checkNotNullParameter(str2, "");
                                application.valueOf().AEQbTJ(str2);
                            }
                        });
                        c5163Hd.copydefault(new String[]{"/", "?", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new Function1<String, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$Companion$parse$1.3
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                invoke2(str2);
                                return Unit.INSTANCE;
                            }

                            /* JADX DEBUG: Class process forced to load method for inline: o.DP.EZpvd(java.lang.String):kotlin.Pair */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull String str2) {
                                Intrinsics.checkNotNullParameter(str2, "");
                                Pair pairOLrzqt = DP.OLrzqt(str2);
                                DB db = (DB) pairOLrzqt.component1();
                                Integer num = (Integer) pairOLrzqt.component2();
                                application.EZpvd(db);
                                if (num != null) {
                                    application.OLrzqt(Integer.valueOf(num.intValue()));
                                }
                            }
                        });
                        final DM dm2 = dm;
                        c5163Hd.OLrzqt("/", new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$Companion$parse$1.4
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                C5163Hd c5163Hd2 = c5163Hd;
                                String[] strArr = {"?", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER};
                                final DL.Application application2 = application;
                                final DM dm3 = dm2;
                                c5163Hd2.copydefault(strArr, new Function1<String, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url.Companion.parse.1.4.1
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                        invoke2(str2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull String str2) {
                                        Intrinsics.checkNotNullParameter(str2, "");
                                        application2.AYXKKw().KWHzl(str2, dm3);
                                    }
                                });
                            }
                        });
                        final DM dm3 = dm;
                        c5163Hd.OLrzqt("?", new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$Companion$parse$1.5
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                C5163Hd c5163Hd2 = c5163Hd;
                                String[] strArr = {ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER};
                                final DL.Application application2 = application;
                                final DM dm4 = dm3;
                                c5163Hd2.copydefault(strArr, new Function1<String, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url.Companion.parse.1.5.1
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                        invoke2(str2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull String str2) {
                                        Intrinsics.checkNotNullParameter(str2, "");
                                        application2.EZpvd().EZpvd(str2, dm4);
                                    }
                                });
                            }
                        });
                        final DM dm4 = dm;
                        c5163Hd.KWHzl(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$Companion$parse$1.6
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                final DL.Application application2 = application;
                                final DM dm5 = dm4;
                                c5163Hd.copydefault(new String[0], new Function1<String, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url.Companion.parse.1.6.1
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                        invoke2(str2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull String str2) {
                                        Intrinsics.checkNotNullParameter(str2, "");
                                        application2.OLrzqt(str2, dm5);
                                    }
                                });
                            }
                        });
                    }
                });
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Cannot parse \"" + str + "\" as a URL", e);
            }
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(DI di, DB db, int i, DS ds, DN dn, DU du, C5166Hg c5166Hg) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(di.EZpvd());
            sb.append("://");
            sb.append(du);
            sb.append(DC.AEQbTJ(db));
            if (i != di.OLrzqt()) {
                sb.append(":");
                sb.append(i);
            }
            int length = sb.length();
            sb.append(ds);
            sb.append(dn);
            if (c5166Hg != null) {
                sb.append('#');
                sb.append(c5166Hg.AEQbTJ());
            }
            java.lang.String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String strSubstring = string.substring(length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return C56390yDp.OLrzqt(string, GZ.copydefault(strSubstring, "/"));
        }
    }

    public final Application valueOf() {
        return new Application(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.DL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DL copy$default(DL dl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.smithy.kotlin.runtime.net.url.Url$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DL.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        return dl.EZpvd(function1);
    }

    public final DL EZpvd(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application applicationValueOf = valueOf();
        function1.invoke(applicationValueOf);
        return applicationValueOf.KWHzl();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DL.class != obj.getClass()) {
            return false;
        }
        DL dl = (DL) obj;
        return Intrinsics.EZpvd(this.valueOf, dl.valueOf) && Intrinsics.EZpvd(this.OLrzqt, dl.OLrzqt) && this.gEmmrt == dl.gEmmrt && Intrinsics.EZpvd(this.AhwBna, dl.AhwBna) && Intrinsics.EZpvd(this.djBIcL, dl.djBIcL) && Intrinsics.EZpvd(this.DbNXlk, dl.DbNXlk) && Intrinsics.EZpvd(this.KWHzl, dl.KWHzl);
    }

    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int i = this.gEmmrt;
        int iHashCode3 = this.AhwBna.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        int iHashCode5 = this.DbNXlk.hashCode();
        C5166Hg c5166Hg = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c5166Hg != null ? c5166Hg.hashCode() : 0);
    }

    public static final class Application implements InterfaceC5180Hu<Application> {
        public DB AEQbTJ;
        public final DU.Application AYXKKw;
        public java.lang.Integer EZpvd;
        public final DN.StateListAnimator KWHzl;
        public C5166Hg OLrzqt;
        public DS.TaskDescription copydefault;
        public DI valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DS.TaskDescription AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DN.StateListAnimator EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull DB db) {
            Intrinsics.checkNotNullParameter(db, "");
            this.AEQbTJ = db;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull DI di) {
            Intrinsics.checkNotNullParameter(di, "");
            this.valueOf = di;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DB copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DU.Application valueOf() {
            return this.AYXKKw;
        }

        public Application(DL dl) {
            DU duDjBIcL;
            DU.Application applicationAEQbTJ;
            DN dnCopydefault;
            DN.StateListAnimator stateListAnimatorGEmmrt;
            DS dsAEQbTJ;
            DS.TaskDescription taskDescriptionCopydefault;
            DB dbOLrzqt;
            DI diAhwBna;
            this.valueOf = (dl == null || (diAhwBna = dl.AhwBna()) == null) ? DI.EZpvd.OLrzqt() : diAhwBna;
            this.AEQbTJ = (dl == null || (dbOLrzqt = dl.OLrzqt()) == null) ? new DB.Application("") : dbOLrzqt;
            this.EZpvd = dl != null ? java.lang.Integer.valueOf(dl.KWHzl()) : null;
            this.copydefault = (dl == null || (dsAEQbTJ = dl.AEQbTJ()) == null || (taskDescriptionCopydefault = dsAEQbTJ.copydefault()) == null) ? new DS.TaskDescription() : taskDescriptionCopydefault;
            this.KWHzl = (dl == null || (dnCopydefault = dl.copydefault()) == null || (stateListAnimatorGEmmrt = dnCopydefault.gEmmrt()) == null) ? new DN.StateListAnimator() : stateListAnimatorGEmmrt;
            this.AYXKKw = (dl == null || (duDjBIcL = dl.djBIcL()) == null || (applicationAEQbTJ = duDjBIcL.AEQbTJ()) == null) ? new DU.Application() : applicationAEQbTJ;
            this.OLrzqt = dl != null ? dl.EZpvd() : null;
        }

        public Application() {
            this(null);
        }

        public final java.lang.String AEQbTJ() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.AEQbTJ);
            java.lang.Integer num = this.EZpvd;
            if (num != null) {
                int iOLrzqt = this.valueOf.OLrzqt();
                if (num == null || num.intValue() != iOLrzqt) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.EZpvd);
                }
            }
            java.lang.String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public final void EZpvd(@NotNull Function1<? super DS.TaskDescription, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(this.copydefault);
        }

        public final void OLrzqt(@NotNull java.lang.String str, @NotNull DM dm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dm, "");
            if (dm.copydefault(DM.Application.EZpvd)) {
                OLrzqt(str);
            } else {
                AEQbTJ(str);
            }
        }

        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str != null ? C5167Hh.KWHzl.OLrzqt().AEQbTJ(str) : null;
        }

        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str != null ? C5167Hh.KWHzl.OLrzqt().OLrzqt(str) : null;
        }

        public final DL KWHzl() {
            DI di = this.valueOf;
            DB db = this.AEQbTJ;
            java.lang.Integer num = this.EZpvd;
            return new DL(di, db, num != null ? num.intValue() : di.OLrzqt(), this.copydefault.OLrzqt(), this.KWHzl.EZpvd(), this.AYXKKw.copydefault(), this.OLrzqt, null);
        }

        /* JADX DEBUG: Method merged with bridge method: gEmmrt()Ljava/lang/Object; */
        @Override // o.InterfaceC5180Hu
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Application gEmmrt() {
            Application application = new Application();
            application.valueOf = this.valueOf;
            application.AEQbTJ = this.AEQbTJ;
            application.EZpvd = this.EZpvd;
            application.copydefault.EZpvd(this.copydefault);
            application.KWHzl.EZpvd(this.KWHzl);
            application.AYXKKw.AEQbTJ(this.AYXKKw);
            application.OLrzqt = this.OLrzqt;
            return application;
        }

        public final void copydefault(@NotNull DL dl) {
            Intrinsics.checkNotNullParameter(dl, "");
            this.valueOf = dl.AhwBna();
            this.AEQbTJ = dl.OLrzqt();
            this.EZpvd = java.lang.Integer.valueOf(dl.KWHzl());
            this.copydefault.AEQbTJ(dl.AEQbTJ());
            this.KWHzl.copydefault(dl.copydefault());
            this.AYXKKw.AEQbTJ(dl.djBIcL());
            this.OLrzqt = dl.EZpvd();
        }

        public final java.lang.String AhwBna() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.copydefault.AEQbTJ());
            sb.append(this.KWHzl.KWHzl());
            C5166Hg c5166Hg = this.OLrzqt;
            if (c5166Hg != null) {
                sb.append('#');
                sb.append(c5166Hg.AEQbTJ());
            }
            java.lang.String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return GZ.copydefault(string, "/");
        }
    }
}
