package geogebra.common.kernel.algos;
import geogebra.common.kernel.commands.Commands;
public enum Algos {
	AlgoAngleConic(Commands.Angle),
	AlgoAngleLines(Commands.Angle),
	AlgoAngleNumeric(Commands.Angle),
	AlgoAnglePoints(Commands.Angle),
	AlgoAnglePolygon(Commands.Angle),
	AlgoAngleVector(Commands.Angle),
	AlgoAngleVectors(Commands.Angle),
	AlgoAngularBisector(Commands.AngularBisector),
	AlgoAngularBisectorLines(Commands.AngularBisector),
	AlgoAngularBisectorPoints(Commands.AngularBisector),
	AlgoAreaConic(Commands.Area),
	AlgoAreaPoints(Commands.Area),
	AlgoAreaPolygon(Commands.Area),
	AlgoAsymptote(Commands.Asymptote),
	AlgoAxes(Commands.Axes),
	AlgoAxisFirst(Commands.FirstAxis),
	AlgoAxisFirstLength(Commands.FirstAxisLength),
	AlgoAxisSecond(Commands.SecondAxis),
	AlgoAxisSecondLength(Commands.SecondAxisLength),
	AlgoTriangleCubic(Commands.TriangleCubic),
	AlgoBarycenter(Commands.Barycenter),
	AlgoTrilinear(Commands.Trilinear),
	AlgoCellRange(Commands.CellRange),
	AlgoCenterConic(Commands.Center),
	AlgoCentroidPolygon(Commands.Centroid),
	AlgoCirclePointRadius(Commands.Circle),
	AlgoCircleThreePoints(Commands.Circle),
	AlgoIncircle(Commands.Incircle),
	AlgoCircleTwoPoints(Commands.Circle),
	AlgoConicFivePoints(Commands.Conic),
	AlgoConicArc(Commands.Arc),
	AlgoConicSector(Commands.Sector),
	AlgoCircleArc(Commands.CircleArc),
	AlgoCircleSector(Commands.CircleSector),
	AlgoCircumcircleArc(Commands.CircumcircleArc),
	AlgoCircumcircleSector(Commands.CircumcircleSector),
	AlgoCurveCartesian(Commands.CurveCartesian),
	AlgoDerivative(Commands.Derivative),
	AlgoDiameterLine(Commands.Diameter),
	AlgoDiameterVector(Commands.Diameter),
	AlgoDilate(Commands.Dilate),
	AlgoDirection(Commands.Direction),
	AlgoDirectrix(Commands.Directrix),
	/*AlgoRadicalAxis(Commands.RadicalAxis),
	AlgoConjugateHyperbola(Commands.ConjugateHyperbola),
	AlgoDirectorCircle(Commands.DirectorCircle),
	AlgoNormalPoints(Commands.NormalPoints),*/
	AlgoDistanceLineLine(Commands.Distance),
	AlgoDistancePointObject(Commands.Distance),
	AlgoDistancePoints(Commands.Distance),
	AlgoEllipseFociLength(Commands.Ellipse),
	AlgoEllipseFociPoint(Commands.Ellipse),
	AlgoExcentricity(Commands.Excentricity),
	AlgoEccentricity(Commands.Eccentricity),
	AlgoExtremumPolynomial(Commands.Extremum),
	AlgoExtremumMulti(Commands.Extremum),
	AlgoFocus(Commands.Focus),
	AlgoFunctionInterval(Commands.Function),
	AlgoHyperbolaFociLength(Commands.Hyperbola),
	AlgoHyperbolaFociPoint(Commands.Hyperbola),
	AlgoIf(Commands.If),
	AlgoIfFunction(Commands.If),
	AlgoIntegral(Commands.Integral),
	AlgoIntegralDefinite(Commands.Integral),
	AlgoIntegralFunctions(Commands.IntegralBetween),
	AlgoIntersectConics(Commands.Intersect),
	AlgoIntersectCS1D1D(Commands.Intersect),
	AlgoIntersectCS1D2D(Commands.Intersect),
	AlgoIntersectCS2D2D(Commands.IntersectionPaths),
	AlgoIntersectFunctionLineNewton(Commands.Intersect),
	AlgoIntersectFunctionsNewton(Commands.Intersect),
	AlgoIntersectLineConic(Commands.Intersect),
	AlgoIntersectLineConic3D(Commands.Intersect),
	AlgoIntersectLineConicRegion(Commands.IntersectionPaths),
	AlgoIntersectLines(Commands.Intersect),
	AlgoIntersectLinePolyLine(Commands.Intersect),
	AlgoIntersectLinePolygon(Commands.Intersect),
	AlgoIntersectLinePolygon3D(Commands.Intersect),
	AlgoIntersectLinePolygonalRegion(Commands.IntersectionPaths),
	AlgoIntersectLinePolygonalRegion3D(Commands.Intersect),
	AlgoIntersectLineQuadric3D(Commands.Intersect),
	AlgoIntersectPlaneConic(Commands.Intersect),
	AlgoIntersectPlanePolygon(Commands.Intersect),
	AlgoIntersectPlanePolygonalRegion(Commands.IntersectionPaths),
	AlgoIntersectPolynomialLine(Commands.Intersect),
	AlgoIntersectPolynomials(Commands.Intersect),
	AlgoIntersectSingle(Commands.Intersect),
	AlgoIntersectSingle3D(Commands.Intersect),
	AlgoIntersectPolynomialConic(Commands.Intersect),
	AlgoIntersectImplicitpolyParametric(Commands.Intersect),
	AlgoIntersectFunctions(Commands.Intersect),
	AlgoIntersectImplicitpolys(Commands.Intersect),
	AlgoImageCorner(Commands.Corner),
	AlgoImplicitPolyThroughPoints(Commands.ImplicitCurve),
	AlgoImplicitPolyFunction(Commands.ImplicitCurve),
	AlgoTextCorner(Commands.Corner),
	AlgoDrawingPadCorner(Commands.Corner),
	AlgoJoinPoints(Commands.Line),
	AlgoJoinPointsRay(Commands.Ray),
	AlgoJoinPointsSegment(Commands.Segment),
	AlgoLengthSegment(Commands.Length),
	AlgoLengthVector(Commands.Length),
	AlgoLineBisector(Commands.LineBisector),
	AlgoLineBisectorSegment(Commands.LineBisector),
	AlgoLinePointLine(Commands.Line),
	AlgoLinePointVector(Commands.Line),
	AlgoLocus(Commands.Locus),
	AlgoLocusSlider(Commands.Locus),
	AlgoMidpoint(Commands.Midpoint),
	AlgoMidpointSegment(Commands.Midpoint),
	AlgoMirror(Commands.Mirror),
	AlgoOrthoLinePointLine(Commands.OrthogonalLine),
	AlgoOrthoLinePointVector(Commands.OrthogonalLine),
	AlgoOrthoVectorLine(Commands.OrthogonalVector),
	AlgoOrthoVectorVector(Commands.OrthogonalVector),
	AlgoParabolaParameter(Commands.Parameter),
	AlgoParabolaPointLine(Commands.Parabola),
	AlgoPointOnPath(Commands.Point),
	AlgoPointVector(Commands.Point),
	AlgoPolarLine(Commands.Polar),
	AlgoPolygon(Commands.Polygon),
	AlgoPolygonRegular(Commands.Polygon),
	AlgoPolygonUnion(Commands.Union),
	AlgoPolygonIntersection(Commands.IntersectRegion),
	AlgoPolynomialFromFunction(Commands.Polynomial),
	AlgoPolynomialFromCoordinates(Commands.Polynomial),
	AlgoRadius(Commands.Radius),
	AlgoRayPointVector(Commands.Ray),
	AlgoRootInterval(Commands.Root),
	AlgoRootNewton(Commands.Root),
	AlgoRootsPolynomial(Commands.Root),
	AlgoRoots(Commands.Roots),
	AlgoRotate(Commands.Rotate),
	AlgoRotatePoint(Commands.Rotate),
	AlgoSemicircle(Commands.Semicircle),
	AlgoSequence(Commands.Sequence),
	AlgoSlope(Commands.Slope),
	AlgoSumLower(Commands.LowerSum),
	AlgoSumUpper(Commands.UpperSum),
	AlgoSumLeft(Commands.LeftSum),
	AlgoSumRectangle(Commands.RectangleSum),
	AlgoTangentFunctionNumber(Commands.Tangent),
	AlgoTangentFunctionPoint(Commands.Tangent),
	AlgoTangentImplicitpoly(Commands.Tangent),
	AlgoTangentLine(Commands.Tangent),
	AlgoTangentPoint(Commands.Tangent),
	AlgoCommonTangents(Commands.Tangent),
	AlgoTaylorSeries(Commands.TaylorSeries),
	AlgoTranslate(Commands.Translate),
	AlgoTranslateVector(Commands.Translate),
	AlgoTurningPointPolynomial(Commands.TurningPoint),
	AlgoUnitOrthoVectorLine(Commands.UnitOrthogonalVector),
	AlgoUnitOrthoVectorVector(Commands.UnitOrthogonalVector),
	AlgoUnitVectorLine(Commands.UnitVector),
	AlgoUnitVectorVector(Commands.UnitVector),
	AlgoVector(Commands.Vector),
	AlgoVectorPoint(Commands.Vector),
	AlgoVertex(Commands.Vertex),
	Expression,
	AlgoAffineRatio(Commands.AffineRatio),
	AlgoCrossRatio(Commands.CrossRatio),
	AlgoCurvatureVector(Commands.CurvatureVector),
	AlgoCurvatureVectorCurve(Commands.CurvatureVector),
	AlgoCurvature(Commands.Curvature),
	AlgoCurvatureCurve(Commands.Curvature),
	AlgoOsculatingCircle(Commands.OsculatingCircle),
	AlgoOsculatingCircleCurve(Commands.OsculatingCircle),
	AlgoTangentCurve(Commands.Tangent),
	AlgoLengthFunction(Commands.Length),
	AlgoLengthFunction2Points(Commands.Length),
	AlgoLengthCurve(Commands.Length),
	AlgoLengthCurve2Points(Commands.Length),
	AlgoCircumferenceConic(Commands.Circumference),
	AlgoPerimeterPoly(Commands.Perimeter),
	AlgoPerimeterLocus(Commands.Perimeter),
	AlgoMod(Commands.Mod),
	AlgoDiv(Commands.Div),
	AlgoMax(Commands.Max),
	AlgoFunctionMax(Commands.Max),
	AlgoMin(Commands.Min),
	AlgoFunctionMin(Commands.Min),
	AlgoLCM(Commands.LCM),
	AlgoListLCM(Commands.LCM),
	AlgoGCD(Commands.GCD),
	AlgoListGCD(Commands.GCD),
	AlgoSort(Commands.Sort),
	AlgoFirst(Commands.First),
	AlgoLast(Commands.Last),
	AlgoTake(Commands.Take),
	AlgoRemoveUndefined(Commands.RemoveUndefined),
	AlgoDefined(Commands.Defined),
	AlgoReverse(Commands.Reverse),
	AlgoSum(Commands.Sum),
	AlgoMean(Commands.Mean),
	AlgoVariance(Commands.Variance),
	AlgoSigmaXX(Commands.SigmaXX),
	AlgoStandardDeviation(Commands.SD),
	AlgoMedian(Commands.Median),
	AlgoQ1(Commands.Q1),
	AlgoQ3(Commands.Q3),
	AlgoMode(Commands.Mode),
	AlgoDoubleListSigmaXY(Commands.SigmaXY),
	AlgoDoubleListPMCC(Commands.PMCC),
	AlgoDoubleListCovariance(Commands.Covariance),
	AlgoDoubleListMeanX(Commands.MeanX),
	AlgoDoubleListMeanY(Commands.MeanY),
	AlgoDoubleListSXY(Commands.SXY),
	AlgoListSigmaXY(Commands.SigmaXY),
	AlgoListSigmaXX(Commands.SigmaXX),
	AlgoListSigmaYY(Commands.SigmaYY),
	AlgoListPMCC(Commands.PMCC),
	AlgoListCovariance(Commands.Covariance),
	AlgoListMeanX(Commands.MeanX),
	AlgoListMeanY(Commands.MeanY),
	AlgoListSampleSDX(Commands.SampleSDX),
	AlgoListSampleSDY(Commands.SampleSDY),
	AlgoSXX(Commands.SXX),
	AlgoListSXX(Commands.SXX),
	AlgoListSYY(Commands.SYY),
	AlgoListSXY(Commands.SXY),
	AlgoFitLineY(Commands.FitLineY),
	AlgoFitLineX(Commands.FitLineX),
	AlgoFitPoly(Commands.FitPoly),
	AlgoFitExp(Commands.FitExp),
	AlgoFitLog(Commands.FitLog),
	AlgoFitPow(Commands.FitPow),
	AlgoRandomNormal(Commands.RandomNormal),
	AlgoInverseNormal(Commands.InverseNormal),
	AlgoNormal(Commands.Normal),
	AlgoBinomial(Commands.Binomial),
	AlgoExpand(Commands.Expand),
	AlgoFactor(Commands.Factor),
	AlgoFactors(Commands.Factors),
	AlgoConstructionStep(Commands.ConstructionStep),
	AlgoStepObject(Commands.ConstructionStep),
	AlgoName(Commands.Name),
	AlgoListMax(Commands.Max),
	AlgoListMin(Commands.Min),
	AlgoListElement(Commands.Element),
	AlgoListLength(Commands.Length),
	AlgoIteration(Commands.Iteration),
	AlgoIterationList(Commands.IterationList),
	AlgoProduct(Commands.Product),
	AlgoRow(Commands.Row),
	AlgoColumn(Commands.Column),
	AlgoLaTeX(Commands.LaTeX),
	AlgoUnicodeToLetter(Commands.UnicodeToLetter),
	AlgoUnicodeToText(Commands.UnicodeToText),
	AlgoTextToUnicode(Commands.TextToUnicode),
	AlgoLetterToUnicode(Commands.LetterToUnicode),
	AlgoBarChart(Commands.BarChart),
	AlgoBoxPlot(Commands.BoxPlot),
	AlgoHistogram(Commands.Histogram),
	AlgoHistogramRight(Commands.HistogramRight),
	AlgoDotPlot(Commands.DotPlot),
	AlgoResidualPlot(Commands.ResidualPlot),
	AlgoNormalQuantilePlot(Commands.NormalQuantilePlot),
	AlgoSumTrapezoidal(Commands.TrapezoidalSum),
	AlgoCountIf(Commands.CountIf),
	AlgoTableText(Commands.TableText),
	AlgoObject(Commands.Object),
	AlgoColumnName(Commands.ColumnName),
	AlgoAppend(Commands.Append),
	AlgoJoin(Commands.Join),
	AlgoFlatten(Commands.Flatten),
	AlgoUnion(Commands.Union),
	AlgoInsert(Commands.Insert),
	AlgoIntersection(Commands.Intersection),
	AlgoSumFunctions(Commands.Sum),
	AlgoIsInteger(Commands.IsInteger),
	AlgoRandom(Commands.Random),
	AlgoRandomUniform(Commands.RandomUniform),
	AlgoRandomBinomial(Commands.RandomBinomial),
	AlgoRandomPoisson(Commands.RandomPoisson),
	AlgoFractionText(Commands.FractionText),
	AlgoKeepIf(Commands.KeepIf),
	AlgoAxisStepX(Commands.AxisStepX),
	AlgoAxisStepY(Commands.AxisStepY),
	AlgoInvert(Commands.Invert),
	AlgoTranspose(Commands.Transpose),
	AlgoDeterminant(Commands.Determinant),
	AlgoSumText(Commands.Sum),
	AlgoSimplify(Commands.Simplify),
	AlgoText(Commands.Text),
	AlgoFitSin(Commands.FitSin),
	AlgoFitLogistic(Commands.FitLogistic),
	AlgoSumPoints(Commands.Sum),
	AlgoSurdText(Commands.SurdText),
	AlgoSurdTextPoint(Commands.SurdText),
	AlgoTTest(Commands.TTest),
	AlgoTTestPaired(Commands.TTestPaired),
	AlgoTTest2(Commands.TTest2),
	AlgoTMeanEstimate(Commands.TMeanEstimate),
	AlgoTMean2Estimate(Commands.TMean2Estimate),
	AlgoANOVA(Commands.ANOVA),
	AlgoPercentile(Commands.Percentile),
	AlgoGeometricMean(Commands.GeometricMean),
	AlgoHarmonicMean(Commands.HarmonicMean),
	//AlgoEvalMathPiper(Commands.EvalMathPiper),
	//AlgoToMathPiperString(Commands.ToMathPiperString),
	AlgoDynamicCoordinates(Commands.DynamicCoordinates),
	AlgoTDistribution(Commands.TDistribution),
	AlgoInverseTDistribution(Commands.InverseTDistribution),
	AlgoFDistribution(Commands.FDistribution),
	AlgoInverseFDistribution(Commands.InverseFDistribution),
	AlgoGamma(Commands.Gamma),
	AlgoInverseGamma(Commands.InverseGamma),
	AlgoCauchy(Commands.Cauchy),
	AlgoInverseCauchy(Commands.InverseCauchy),
	AlgoChiSquared(Commands.ChiSquared),
	AlgoInverseChiSquared(Commands.InverseChiSquared),
	AlgoExponential(Commands.Exponential),
	AlgoInverseExponential(Commands.InverseExponential),
	AlgoHyperGeometric(Commands.HyperGeometric),
	AlgoHyperGeometricBarChart(Commands.HyperGeometric),
	AlgoInverseHyperGeometric(Commands.InverseHyperGeometric),
	AlgoPascal(Commands.Pascal),
	AlgoPascalBarChart(Commands.Pascal),
	AlgoInversePascal(Commands.InversePascal),
	AlgoPoisson(Commands.Poisson),
	AlgoPoissonBarChart(Commands.Poisson),
	AlgoInversePoisson(Commands.InversePoisson),
	AlgoBinomialDist(Commands.BinomialDist),
	AlgoBinomialDistBarChart(Commands.BinomialDist),
	AlgoInverseBinomial(Commands.InverseBinomial),
	AlgoWeibull(Commands.Weibull),
	AlgoInverseWeibull(Commands.InverseWeibull),
	AlgoZipf(Commands.Zipf),
	AlgoInverseZipf(Commands.InverseZipf),
	AlgoCell(Commands.Cell),
	AlgoTextLength(Commands.Length),
	AlgoTextElement(Commands.Element),
	AlgoPolynomialDiv(Commands.Div),
	AlgoPolynomialMod(Commands.Mod),
	AlgoDegree(Commands.Degree),
	AlgoCoefficients(Commands.Coefficients),
	AlgoConicCoefficients(Commands.Coefficients),
	AlgoConicFromCoeffList(Commands.Conic),
	AlgoLimit(Commands.Limit),
	AlgoLimitBelow(Commands.LimitBelow),
	AlgoLimitAbove(Commands.LimitAbove),
	AlgoAsymptoteFunction(Commands.Asymptote),
	AlgoAsymptoteImplicitPoly(Commands.Asymptote),
	AlgoPartialFractions(Commands.PartialFractions),
	AlgoNumerator(Commands.Numerator),
	AlgoDenominator(Commands.Denominator),
	AlgoSumSquaredErrors(Commands.SumSquaredErrors),
	AlgoRSquare(Commands.RSquare),
	AlgoFit(Commands.Fit),
	AlgoFitNL(Commands.Fit),
	AlgoFitGrowth(Commands.FitGrowth),
	AlgoPointsFromList(Commands.Point),
	AlgoPointList(Commands.PointList),
	AlgoRootList(Commands.RootList),
	AlgoIntersectLineCubic(Commands.Intersect),
	AlgoSampleStandardDeviation(Commands.SampleSD),
	AlgoSampleVariance(Commands.SampleVariance),
	AlgoSpearman(Commands.Spearman),
	AlgoFrequencyPolygon(Commands.FrequencyPolygon),
	AlgoFrequencyTable(Commands.FrequencyTable),
	AlgoReducedRowEchelonForm(Commands.ReducedRowEchelonForm),
	AlgoTiedRank(Commands.TiedRank),
	AlgoOrdinalRank(Commands.OrdinalRank),
	AlgoShuffle(Commands.Shuffle),
	AlgoRotateVector(Commands.Rotate),
	AlgoRandomElement(Commands.RandomElement),
	AlgoApplyMatrix(Commands.ApplyMatrix),
	AlgoShear(Commands.Shear),
	AlgoStretch(Commands.Stretch),
	AlgoComplexRoot(Commands.ComplexRoot),
	AlgoSimplifyText(Commands.Simplify),
	AlgoSolveODE(Commands.SolveODE),
	AlgoSolveODE2(Commands.SolveODE),
	AlgoSolveODECas(Commands.SolveODE),
	AlgoPolyLine(Commands.PolyLine),
	AlgoPolyLine3D(Commands.PolyLine),
	AlgoFirstString(Commands.First),
	AlgoLastString(Commands.Last),
	AlgoTakeString(Commands.Take),
	AlgoRotateText(Commands.RotateText),
	AlgoVerticalText(Commands.VerticalText),
	AlgoSample(Commands.Sample),
	AlgoVoronoi(Commands.Voronoi),
	AlgoHull(Commands.Hull),
	AlgoConvexHull(Commands.ConvexHull),
	AlgoMinimumSpanningTree(Commands.MinimumSpanningTree),
	AlgoDelauneyTriangulation(Commands.DelauneyTriangulation),
	AlgoTravelingSalesman(Commands.TravelingSalesman),
	AlgoShortestDistance(Commands.ShortestDistance),
	AlgoSelectedElement(Commands.SelectedElement),
	AlgoSelectedIndex(Commands.SelectedIndex),
	AlgoStemPlot(Commands.StemPlot),
	AlgoFrequency(Commands.Frequency),
	AlgoUnique(Commands.Unique),
	AlgoClasses(Commands.Classes),
	AlgoIndexOf(Commands.IndexOf),
	AlgoZip(Commands.Zip),
	AlgoFirstLocus(Commands.First),
	AlgoLengthLocus(Commands.Length),
	AlgoPrimeFactors(Commands.PrimeFactors),
	//AlgoPrimeFactorization(Commands.PrimeFactorization),
	AlgoIsInRegion(Commands.IsInRegion),
	AlgoPathParameter(Commands.PathParameter),
	AlgoClosestPoint(Commands.ClosestPoint),
	AlgoComplexPolynomial(Commands.ComplexRoot),
	AlgoOrdinal(Commands.Ordinal),
	AlgoIntervalMidpoint(Commands.Midpoint),
	AlgoIntervalMin(Commands.Min),
	AlgoIntervalMax(Commands.Max),
	AlgoMaximize(Commands.Maximize),
	AlgoMinimize(Commands.Minimize),
	AlgoTextfield(Commands.Textfield),
	AlgoListSDX(Commands.SDX),
	AlgoListSDY(Commands.SDY),
	AlgoRootMeanSquare(Commands.RootMeanSquare),
	AlgoCompleteSquare(Commands.CompleteSquare),
	AlgoBernoulliBarChart(Commands.Bernoulli),
	AlgoZipfBarChart(Commands.Zipf),
	AlgoKimberling(Commands.TriangleCenter),
	AlgoFunctionFreehand(Commands.Function),
	AlgoTriangleCurve(Commands.TriangleCurve),
	AlgoPolygon3D(Commands.Polygon),
	//AlgoCoordSys2D(Commands.CoordSys2D),
	AlgoJoinPoints3DSegment(Commands.Segment),
	AlgoJoinPoints3DLine(Commands.Line),
	AlgoJoinPoints3DRay(Commands.Ray),
	AlgoOrthoLinePoint(Commands.OrthogonalLine),
	AlgoOrthoLinePointPlane(Commands.OrthogonalLine),
	AlgoOrthoLineLineLine(Commands.OrthogonalLine),
	AlgoOrthoLineLinePointPlane(Commands.OrthogonalLine),
	AlgoOrthoVectorPlane(Commands.OrthogonalVector),
	AlgoUnitOrthoVectorPlane(Commands.UnitOrthogonalVector),
	AlgoCircle3DThreePoints(Commands.Circle),
	AlgoCircleAxisPoint(Commands.Circle),
	AlgoCirclePointRadiusDirection(Commands.Circle),
	AlgoCirclePointPointDirection(Commands.Circle),
	AlgoPlane(Commands.Plane),
	AlgoPlaneThroughPoint(Commands.Plane),
	AlgoOrthoPlanePoint(Commands.PerpendicularPlane),
	AlgoPlaneBisector(Commands.PlaneBisector),
	//Algo3Dto2D(Commands.To2D),
	AlgoPoint3DOnPath(Commands.Point),
	AlgoIntersectCoordSys(Commands.Intersect),
	AlgoPointInRegion(Commands.PointIn),
	AlgoPoint3DInRegion(Commands.PointIn),
	AlgoSphere(Commands.Sphere),
	//AlgoPolyhedron(Commands.Polyhedron),
	AlgoPrism(Commands.Prism),
	AlgoPyramid(Commands.Pyramid),
	AlgoIntersectPlanes(Commands.IntersectionPaths),
	AlgoIntersectPlaneQuadric(Commands.IntersectionPaths),
	AlgoSpherePointRadius(Commands.Sphere),
	AlgoSphereTwoPoints(Commands.Sphere),
	AlgoCone(Commands.Cone),
	AlgoLimitedCone(Commands.Cone),
	AlgoConeInfinitePointVectorNumber(Commands.InfiniteCone),
	AlgoConeInfinitePointPointNumber(Commands.InfiniteCone),
	AlgoConeInfinitePointLineAngle(Commands.InfiniteCone),
	AlgoCylinder(Commands.Cylinder),
	AlgoLimitedCylinder(Commands.Cylinder),
	AlgoCylinderInfinitePointPointNumber(Commands.InfiniteCylinder),
	AlgoCylinderInfinitePointVectorNumber(Commands.InfiniteCylinder),
	AlgoCylinderInfiniteAxisRadius(Commands.InfiniteCylinder),
	AlgoTetrahedron(Commands.Tetrahedron),
	AlgoCube(Commands.Cube),
	AlgoOctahedron(Commands.Octahedron),
	AlgoDodecahedron(Commands.Dodecahedron),
	AlgoIcosahedron(Commands.Icosahedron),
	AlgoQuadricSide(Commands.QuadricSide),
	AlgoQuadricEnds(Commands.Ends),
	AlgoQuadricEndBottom(Commands.Bottom),
	AlgoQuadricEndTop(Commands.Top),
	AlgoSurfaceCartesian(Commands.SurfaceCartesian), 
	AlgoDependentPlane,AlgoDependentPoint3D,
	AlgoDependentPoint,AlgoDependentList,AlgoDependentImplicitPoly,
	AlgoDependentCasCell,AlgoDependentVector,AlgoDependentText,
	AlgoDependentNumber,AlgoDependentListExpression,
AlgoDependentBoolean,AlgoDependentConic,AlgoDependentFunction,
AlgoDependentFunctionNVar,AlgoDependentInterval,AlgoDependentLine,
AlgoCellRangeExpression,AlgoDependentGeoCopy,AlgoMacro,
AlgoTo2D,AlgoDependentVector3D,AlgoParametricDerivative,
	AlgoDoubleListSigmaXX(Commands.SigmaXX),
	AlgoDoubleListSigmaYY(Commands.SigmaYY),
	AlgoDoubleListSXX(Commands.SXX),
	AlgoDoubleListSYY(Commands.SYY),
	AlgoExtremumNumerical(Commands.Extremum),
	AlgoSimpleRootsPoly(Commands.Roots),
	AlgoImplicitPolyTangentCurve(Commands.Tangent), AlgoProve(Commands.Prove);
	private String command;
	private Algos(){
		this.command="Expression";
	}
	private Algos(Commands command){
		this.command = command.name();
	}
	public String getCommand(){
		return command;
	}
	
}
