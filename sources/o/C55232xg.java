package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignedBodyHeader;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: renamed from: o.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55232xg {
    public static final C55232xg EZpvd = new C55232xg();
    public static final C57737yo<InterfaceC55285xh> AhwBna = new C57737yo<>("aws.smithy.kotlin.signing#Signer");
    public static final C57737yo<java.lang.String> AYXKKw = new C57737yo<>("aws.smithy.kotlin.signing#AwsSigningRegion");
    public static final C57737yo<java.util.Set<java.lang.String>> gEmmrt = new C57737yo<>("aws.smithy.kotlin.signing#AwsSigningRegionSet");
    public static final C57737yo<java.lang.String> isConnected = new C57737yo<>("aws.smithy.kotlin.signing#AwsSigningService");
    public static final C57737yo<C5173Hn> valueOf = new C57737yo<>("aws.smithy.kotlin.signing#SigningDate");
    public static final C57737yo<InterfaceC52805wZ> KWHzl = new C57737yo<>("aws.smithy.kotlin.signing#CredentialsProvider");
    public static final C57737yo<AbstractC55709xp> AEQbTJ = new C57737yo<>("aws.smithy.kotlin.signing#HashSpecification");
    public static final C57737yo<AwsSignedBodyHeader> djBIcL = new C57737yo<>("aws.smithy.kotlin.signing#SignedBodyHeader");
    public static final C57737yo<CompletableDeferred<byte[]>> OLrzqt = new C57737yo<>("aws.smithy.kotlin.signing#RequestSignature");
    public static final C57737yo<java.lang.Boolean> values = new C57737yo<>("aws.smithy.kotlin.signing#UseDoubleUriEncode");
    public static final C57737yo<java.lang.Boolean> copydefault = new C57737yo<>("aws.smithy.kotlin.signing#NormalizeUriPath");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<java.lang.Boolean> AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<java.lang.String> AYXKKw() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<C5173Hn> AhwBna() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<AbstractC55709xp> EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<CompletableDeferred<byte[]>> KWHzl() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<AwsSignedBodyHeader> OLrzqt() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<InterfaceC52805wZ> copydefault() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<java.util.Set<java.lang.String>> djBIcL() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<java.lang.String> gEmmrt() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<java.lang.Boolean> valueOf() {
        return values;
    }

    private C55232xg() {
    }
}
