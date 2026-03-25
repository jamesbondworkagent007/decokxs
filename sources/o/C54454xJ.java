package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.xJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C54454xJ {
    public static final C5098Eq AEQbTJ;
    public static final C5101Et EZpvd;
    public static final C5101Et OLrzqt;
    public static final C54454xJ copydefault = new C54454xJ();

    private C54454xJ() {
    }

    static {
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new C5128Fu("Errors"), new C5115Fh("Error"));
        EZpvd = c5101Et;
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new C5128Fu("RequestId"));
        OLrzqt = c5101Et2;
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new C5128Fu("Response"));
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        AEQbTJ = activity.KWHzl();
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r12v4. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0082 -> B:21:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b8 -> B:29:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@org.jetbrains.annotations.NotNull o.InterfaceC5095En r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.C54508xL> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof aws.smithy.kotlin.runtime.awsprotocol.xml.Ec2QueryErrorResponseDeserializer$deserialize$1
            if (r0 == 0) goto L13
            r0 = r12
            aws.smithy.kotlin.runtime.awsprotocol.xml.Ec2QueryErrorResponseDeserializer$deserialize$1 r0 = (aws.smithy.kotlin.runtime.awsprotocol.xml.Ec2QueryErrorResponseDeserializer$deserialize$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            aws.smithy.kotlin.runtime.awsprotocol.xml.Ec2QueryErrorResponseDeserializer$deserialize$1 r0 = new aws.smithy.kotlin.runtime.awsprotocol.xml.Ec2QueryErrorResponseDeserializer$deserialize$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = o.C56437yFi.OLrzqt()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L55
            if (r2 != r3) goto L4d
            java.lang.Object r11 = r0.L$6
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.L$5
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r4 = r0.L$4
            o.En$ActionBar r4 = (o.InterfaceC5095En.ActionBar) r4
            java.lang.Object r5 = r0.L$3
            o.En$StateListAnimator r5 = (o.InterfaceC5095En.StateListAnimator) r5
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            o.En r8 = (o.InterfaceC5095En) r8
            o.C56391yDq.AEQbTJ(r12)
            r9 = r2
            r2 = r0
            r0 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            r4 = r9
            goto Lbb
        L4d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L55:
            o.C56391yDq.AEQbTJ(r12)
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            java.util.List r2 = kotlin.collections.CollectionsKt.EZpvd()
            r12.element = r2
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            o.Eq r4 = o.C54454xJ.AEQbTJ
            o.En$StateListAnimator r4 = r11.EZpvd(r4)
        L6e:
            java.lang.Integer r5 = r4.OLrzqt()
            o.Et r6 = o.C54454xJ.EZpvd
            int r7 = r6.copydefault()
            if (r5 != 0) goto L7c
            goto Lce
        L7c:
            int r8 = r5.intValue()
            if (r8 != r7) goto Lce
            o.En$ActionBar r5 = r11.KWHzl(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r4
            r4 = r12
            r12 = r11
            r11 = r6
            r6 = r5
            r5 = r2
            r2 = r0
            r0 = r4
        L93:
            boolean r8 = r6.EZpvd()
            if (r8 == 0) goto Lc6
            boolean r8 = r6.copydefault()
            if (r8 == 0) goto Lc2
            o.xI r8 = o.C54427xI.copydefault
            r2.L$0 = r12
            r2.L$1 = r0
            r2.L$2 = r5
            r2.L$3 = r7
            r2.L$4 = r6
            r2.L$5 = r4
            r2.L$6 = r11
            r2.label = r3
            java.lang.Object r8 = r8.AEQbTJ(r12, r2)
            if (r8 != r1) goto Lb8
            return r1
        Lb8:
            r9 = r8
            r8 = r12
            r12 = r9
        Lbb:
            o.xG r12 = (o.C54373xG) r12
            r11.add(r12)
            r12 = r8
            goto L93
        Lc2:
            r6.gEmmrt()
            goto L93
        Lc6:
            r4.element = r11
            r11 = r12
            r12 = r0
            r0 = r2
            r2 = r5
            r4 = r7
            goto L6e
        Lce:
            o.Et r6 = o.C54454xJ.OLrzqt
            int r6 = r6.copydefault()
            if (r5 != 0) goto Ld7
            goto Le4
        Ld7:
            int r7 = r5.intValue()
            if (r7 != r6) goto Le4
            java.lang.String r5 = r4.fetchVPNInfo()
            r2.element = r5
            goto L6e
        Le4:
            if (r5 == 0) goto Lea
            r4.copydefault()
            goto L6e
        Lea:
            o.xL r11 = new o.xL
            T r12 = r12.element
            java.util.List r12 = (java.util.List) r12
            T r0 = r2.element
            java.lang.String r0 = (java.lang.String) r0
            r11.<init>(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C54454xJ.copydefault(o.En, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
