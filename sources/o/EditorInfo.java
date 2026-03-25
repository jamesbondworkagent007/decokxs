package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class EditorInfo implements CorrectionInfo {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull CompletionInfo completionInfo, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamOLrzqt;
        PushbackInputStream pushbackInputStreamOLrzqt2 = Scroller.OLrzqt(completionInfo.copydefault());
        if (pushbackInputStreamOLrzqt2 != null && Intrinsics.EZpvd(completionInfo.OLrzqt(), C56443yFo.KWHzl(true)) && completionInfo.KWHzl() == null && completionInfo.copydefault() != null && Intrinsics.EZpvd(completionInfo.EZpvd(), C56443yFo.KWHzl(false)) && Intrinsics.EZpvd(completionInfo.AEQbTJ(), C56443yFo.KWHzl(false))) {
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "ap-northeast-1")) {
                DL dl = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt = new C58002yt();
                c58002yt.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit = Unit.INSTANCE;
                return new C57631ym(dl, null, c58002yt.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "ap-south-1")) {
                DL dl2 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt2 = new C58002yt();
                c58002yt2.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit2 = Unit.INSTANCE;
                return new C57631ym(dl2, null, c58002yt2.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "ap-southeast-1")) {
                DL dl3 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt3 = new C58002yt();
                c58002yt3.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit3 = Unit.INSTANCE;
                return new C57631ym(dl3, null, c58002yt3.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "ap-southeast-2")) {
                DL dl4 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt4 = new C58002yt();
                c58002yt4.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit4 = Unit.INSTANCE;
                return new C57631ym(dl4, null, c58002yt4.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "aws-global")) {
                DL dl5 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt5 = new C58002yt();
                c58002yt5.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit5 = Unit.INSTANCE;
                return new C57631ym(dl5, null, c58002yt5.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "ca-central-1")) {
                DL dl6 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt6 = new C58002yt();
                c58002yt6.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit6 = Unit.INSTANCE;
                return new C57631ym(dl6, null, c58002yt6.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "eu-central-1")) {
                DL dl7 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt7 = new C58002yt();
                c58002yt7.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit7 = Unit.INSTANCE;
                return new C57631ym(dl7, null, c58002yt7.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "eu-north-1")) {
                DL dl8 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt8 = new C58002yt();
                c58002yt8.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit8 = Unit.INSTANCE;
                return new C57631ym(dl8, null, c58002yt8.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "eu-west-1")) {
                DL dl9 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt9 = new C58002yt();
                c58002yt9.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit9 = Unit.INSTANCE;
                return new C57631ym(dl9, null, c58002yt9.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "eu-west-2")) {
                DL dl10 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt10 = new C58002yt();
                c58002yt10.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit10 = Unit.INSTANCE;
                return new C57631ym(dl10, null, c58002yt10.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "eu-west-3")) {
                DL dl11 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt11 = new C58002yt();
                c58002yt11.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit11 = Unit.INSTANCE;
                return new C57631ym(dl11, null, c58002yt11.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "sa-east-1")) {
                DL dl12 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt12 = new C58002yt();
                c58002yt12.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit12 = Unit.INSTANCE;
                return new C57631ym(dl12, null, c58002yt12.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "us-east-1")) {
                DL dl13 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt13 = new C58002yt();
                c58002yt13.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit13 = Unit.INSTANCE;
                return new C57631ym(dl13, null, c58002yt13.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "us-east-2")) {
                DL dl14 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt14 = new C58002yt();
                c58002yt14.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit14 = Unit.INSTANCE;
                return new C57631ym(dl14, null, c58002yt14.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "us-west-1")) {
                DL dl15 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt15 = new C58002yt();
                c58002yt15.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit15 = Unit.INSTANCE;
                return new C57631ym(dl15, null, c58002yt15.AEQbTJ(), 2, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "us-west-2")) {
                DL dl16 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt16 = new C58002yt();
                c58002yt16.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit16 = Unit.INSTANCE;
                return new C57631ym(dl16, null, c58002yt16.AEQbTJ(), 2, null);
            }
            DL dl17 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts." + completionInfo.copydefault() + '.' + pushbackInputStreamOLrzqt2.KWHzl(), null, 2, null);
            C58002yt c58002yt17 = new C58002yt();
            c58002yt17.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", java.lang.String.valueOf(completionInfo.copydefault()), C56443yFo.KWHzl(false), null, 17, null)));
            Unit unit17 = Unit.INSTANCE;
            return new C57631ym(dl17, null, c58002yt17.AEQbTJ(), 2, null);
        }
        if (completionInfo.KWHzl() != null) {
            if (Intrinsics.EZpvd(completionInfo.EZpvd(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(completionInfo.AEQbTJ(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, completionInfo.KWHzl(), null, 2, null), null, 2, null);
        }
        if (completionInfo.copydefault() != null && (pushbackInputStreamOLrzqt = Scroller.OLrzqt(completionInfo.copydefault())) != null) {
            if (Intrinsics.EZpvd(completionInfo.EZpvd(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(completionInfo.AEQbTJ(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts-fips." + completionInfo.copydefault() + '.' + pushbackInputStreamOLrzqt.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(completionInfo.EZpvd(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamOLrzqt.OLrzqt(), C56443yFo.KWHzl(true))) {
                    if (Intrinsics.EZpvd((java.lang.Object) pushbackInputStreamOLrzqt.AEQbTJ(), (java.lang.Object) "aws-us-gov")) {
                        return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts." + completionInfo.copydefault() + ".amazonaws.com", null, 2, null), null, 2, null);
                    }
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts-fips." + completionInfo.copydefault() + '.' + pushbackInputStreamOLrzqt.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(completionInfo.AEQbTJ(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts." + completionInfo.copydefault() + '.' + pushbackInputStreamOLrzqt.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            if (Intrinsics.EZpvd((java.lang.Object) completionInfo.copydefault(), (java.lang.Object) "aws-global")) {
                DL dl18 = DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts.amazonaws.com", null, 2, null);
                C58002yt c58002yt18 = new C58002yt();
                c58002yt18.KWHzl(C57684yn.OLrzqt(), C56402yEa.EZpvd(C3020Ae.sigV4$default(false, "sts", "us-east-1", C56443yFo.KWHzl(false), null, 17, null)));
                Unit unit18 = Unit.INSTANCE;
                return new C57631ym(dl18, null, c58002yt18.AEQbTJ(), 2, null);
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://sts." + completionInfo.copydefault() + '.' + pushbackInputStreamOLrzqt.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
