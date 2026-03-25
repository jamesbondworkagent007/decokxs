package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC14334djW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15538eMa {
    public static final C15538eMa OLrzqt = new C15538eMa();
    public static boolean EZpvd = true;
    public static final int KWHzl = 8;

    private C15538eMa() {
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("KEY_IS_SHOW_CLOUD_BACKUP_TIP", java.lang.Boolean.valueOf(z));
        EZpvd = z;
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("KEY_IS_SHOW_CLOUD_BACKUP_TIP", true);
    }

    public final SupportCloudType EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        return c14392dkb.OLrzqt() ? SupportCloudType.GOOGLE_CLOUD : c14392dkb.KWHzl(context) ? SupportCloudType.BOTH_CLOUD : SupportCloudType.HUAWEI_CLOUD;
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super java.lang.Integer, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        abstractActivityC33041mov.showLoading();
        EZpvd(abstractActivityC33041mov, new Function0() { // from class: o.eMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15538eMa.KWHzl(abstractActivityC33041mov, str, fragmentManager, function1);
            }
        });
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1) {
        abstractActivityC33041mov.dismissLoading();
        OLrzqt.AEQbTJ(str, abstractActivityC33041mov, fragmentManager, function1);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.djW.Application.judgeCloudServerStatus$default(o.djW, o.mov, int, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        InterfaceC14334djW interfaceC14334djWOLrzqt = c14392dkb.OLrzqt(abstractActivityC33041mov, 2);
        if (c14392dkb.djBIcL(abstractActivityC33041mov)) {
            if (interfaceC14334djWOLrzqt != null) {
                InterfaceC14334djW.Application.judgeCloudServerStatus$default(interfaceC14334djWOLrzqt, abstractActivityC33041mov, 0, new Function0() { // from class: o.eMh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C15538eMa.KWHzl(function0);
                    }
                }, 2, null);
            }
        } else {
            abstractActivityC33041mov.dismissLoading();
            if (interfaceC14334djWOLrzqt != null) {
                interfaceC14334djWOLrzqt.copydefault(abstractActivityC33041mov);
            }
        }
    }

    public static final Unit KWHzl(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC14334djW.Application.judgeCloudServerStatus$default(new C14335djX(), abstractActivityC33041mov, 0, new Function0() { // from class: o.eMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15538eMa.copydefault(function0);
            }
        }, 2, null);
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eMa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void generateHuaweiBackupWallet$default(C15538eMa c15538eMa, java.lang.String str, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        c15538eMa.AEQbTJ(str, abstractActivityC33041mov, fragmentManager, function1);
    }

    public static final Unit AEQbTJ(final AbstractActivityC33041mov abstractActivityC33041mov, final androidx.fragment.app.FragmentManager fragmentManager, final java.lang.String str, final Function1 function1, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractActivityC33041mov abstractActivityC33041mov2 = abstractActivityC33041mov instanceof AbstractActivityC33041mov ? abstractActivityC33041mov : null;
        if (abstractActivityC33041mov2 != null) {
            abstractActivityC33041mov2.showLoadingAtOnceCannotCancel();
        }
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(abstractActivityC33041mov, 2);
        if (interfaceC14373dkIEZpvd == null) {
            return Unit.INSTANCE;
        }
        interfaceC14373dkIEZpvd.copydefault(abstractActivityC33041mov, new Function2() { // from class: o.eMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C15538eMa.copydefault(abstractActivityC33041mov, fragmentManager, str, str2, function1, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, Function1 function1, boolean z, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        abstractActivityC33041mov.dismissLoading();
        if (z) {
            OLrzqt.copydefault(fragmentManager, str3, str, str2, 2, (Function1<? super java.lang.Integer, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str, final AbstractActivityC33041mov abstractActivityC33041mov, final androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super java.lang.Integer, Unit> function1) {
        new C14461dlr(fragmentManager, "huaweiCloudBackup-home", new Function1() { // from class: o.eMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15538eMa.AEQbTJ(abstractActivityC33041mov, fragmentManager, str, function1, (java.lang.String) obj);
            }
        }, null, null, false, 56, null).EZpvd();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.for.StateListAnimator.start$default(o.for$StateListAnimator, androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public static final void KWHzl(java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str2, java.lang.String str3, final int i, final Function1<? super java.lang.Integer, Unit> function1) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Cfor.Companion.KWHzl(fragmentManager, str2, str3, str, (80 & 16) != 0 ? 0 : 0, (80 & 32) != 0 ? 1 : i, (80 & 64) != 0, (80 & 128) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE 
                  (wrap:o.for$StateListAnimator:0x000a: SGET  A[WRAPPED] (LINE:138) o.for.Companion o.for$StateListAnimator)
                  (r13v0 'fragmentManager' androidx.fragment.app.FragmentManager)
                  (r14v0 'str2' java.lang.String)
                  (r15v0 'str3' java.lang.String)
                  (r12v0 'str' java.lang.String)
                  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (80 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (0 int))
                  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (80 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r16v0 'i' int))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (80 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : false)
                  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (80 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:59) call: o.foB.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x0010: CONSTRUCTOR 
                  (r17v0 'function1' kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> A[DONT_INLINE])
                  (r16v0 'i' int A[DONT_INLINE])
                 A[MD:(kotlin.jvm.functions.Function1, int):void (m), WRAPPED] call: o.eMl.<init>(kotlin.jvm.functions.Function1, int):void type: CONSTRUCTOR))
                 VIRTUAL call: o.for.StateListAnimator.KWHzl(androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, kotlin.jvm.functions.Function0):void A[MD:(androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:51) in method: o.eMa.KWHzl(java.lang.String, androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>):void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.foB, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 21 more
                */
            /*
                r6 = r16
                r0 = r17
                boolean r1 = o.C33129mqd.OLrzqt(r12)
                if (r1 == 0) goto L21
                o.for$StateListAnimator r1 = o.Cfor.Companion
                r5 = 0
                r7 = 0
                o.eMl r8 = new o.eMl
                r8.<init>()
                r9 = 80
                r10 = 0
                r0 = r1
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r12
                r6 = r16
                o.Cfor.StateListAnimator.start$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                goto L3c
            L21:
                o.foj$StateListAnimator r1 = o.ActivityC18774foj.Companion
                r4 = 0
                r7 = 0
                r8 = 0
                o.eMi r9 = new o.eMi
                r9.<init>()
                r10 = 104(0x68, float:1.46E-43)
                r11 = 0
                r0 = r1
                r1 = r13
                r2 = r14
                r3 = r15
                r5 = r16
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                o.ActivityC18774foj.StateListAnimator.start$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L3c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C15538eMa.KWHzl(java.lang.String, androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function1):void");
        }

        public static final Unit EZpvd(Function1 function1, int i) {
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(i));
            }
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(Function1 function1, int i) {
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(i));
            }
            return Unit.INSTANCE;
        }

        public final void copydefault(final androidx.fragment.app.FragmentManager fragmentManager, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i, final Function1<? super java.lang.Integer, Unit> function1) {
            if (EZpvd()) {
                new C18800fpJ().EZpvd(fragmentManager, new Function0() { // from class: o.eMc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C15538eMa.copydefault(str, fragmentManager, str2, str3, i, function1);
                    }
                });
                EZpvd(false);
            } else {
                KWHzl(str, fragmentManager, str2, str3, i, function1);
            }
        }

        public static final Unit copydefault(java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str2, java.lang.String str3, int i, Function1 function1) {
            KWHzl(str, fragmentManager, str2, str3, i, (Function1<? super java.lang.Integer, Unit>) function1);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eMa */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void handleClickGoogleCloudBackup$default(C15538eMa c15538eMa, java.lang.String str, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, boolean z, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = true;
            }
            c15538eMa.KWHzl(str, abstractActivityC33041mov, fragmentManager, z, (Function1<? super java.lang.Integer, Unit>) ((i & 16) != 0 ? null : function1), (Function0<Unit>) ((i & 32) != 0 ? null : function0));
        }

        public final void KWHzl(@NotNull final java.lang.String str, @NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, final boolean z, final Function1<? super java.lang.Integer, Unit> function1, final Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            abstractActivityC33041mov.showLoading();
            final C14396dkf c14396dkf = new C14396dkf();
            if (!c14396dkf.AEQbTJ(abstractActivityC33041mov)) {
                abstractActivityC33041mov.dismissLoading();
                KWHzl(abstractActivityC33041mov, z, function0);
            } else {
                c14396dkf.OLrzqt(new Function1() { // from class: o.eMm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15538eMa.copydefault(abstractActivityC33041mov, fragmentManager, c14396dkf, str, function1, z, function0, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        }

        public static final Unit copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final androidx.fragment.app.FragmentManager fragmentManager, final C14396dkf c14396dkf, final java.lang.String str, final Function1 function1, final boolean z, final Function0 function0, boolean z2) {
            abstractActivityC33041mov.dismissLoading();
            if (z2) {
                new C14461dlr(fragmentManager, "googleCloudBackup-home", new Function1() { // from class: o.eLY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15538eMa.copydefault(abstractActivityC33041mov, c14396dkf, fragmentManager, str, function1, z, function0, (java.lang.String) obj);
                    }
                }, null, null, false, 56, null).EZpvd();
            } else {
                new C14335djX().EZpvd(abstractActivityC33041mov);
            }
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, C14396dkf c14396dkf, final androidx.fragment.app.FragmentManager fragmentManager, final java.lang.String str, final Function1 function1, final boolean z, final Function0 function0, final java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            abstractActivityC33041mov.showLoading();
            c14396dkf.copydefault(abstractActivityC33041mov, new Function2() { // from class: o.eMd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C15538eMa.copydefault(abstractActivityC33041mov, fragmentManager, str, str2, function1, z, function0, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, Function1 function1, boolean z, Function0 function0, boolean z2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            abstractActivityC33041mov.dismissLoading();
            if (z2) {
                OLrzqt.copydefault(fragmentManager, str3, str, str2, 1, (Function1<? super java.lang.Integer, Unit>) function1);
            } else {
                OLrzqt.KWHzl(abstractActivityC33041mov, z, function0);
            }
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eMa */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showFailDialog$default(C15538eMa c15538eMa, FragmentActivity fragmentActivity, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            c15538eMa.KWHzl(fragmentActivity, z, function0);
        }

        public final void KWHzl(FragmentActivity fragmentActivity, boolean z, final Function0<Unit> function0) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
            int i = C13754dXa.FragmentManager.launchUnit;
            C11573cTg c11573cTg = C11573cTg.KWHzl;
            viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", c11573cTg.KWHzl()))));
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.parseResult, C56423yEv.EZpvd(C56390yDp.OLrzqt("cloud", c11573cTg.KWHzl()))));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getHideOffset), new View.OnClickListener() { // from class: o.eMf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C15538eMa.OLrzqt(viewOnClickListenerC54939xaY, view);
                }
            });
            if (z) {
                viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.component2, new View.OnClickListener() { // from class: o.eMe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C15538eMa.AEQbTJ(function0, viewOnClickListenerC54939xaY, view);
                    }
                });
            }
            viewOnClickListenerC54939xaY.show();
        }

        public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        public static final void AEQbTJ(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            if (function0 != null) {
                function0.invoke();
            }
            viewOnClickListenerC54939xaY.dismiss();
        }
    }
