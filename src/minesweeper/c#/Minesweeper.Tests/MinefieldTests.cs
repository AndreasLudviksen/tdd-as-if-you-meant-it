namespace Minesweeper.Tests;
using FluentAssertions;

public class MinefieldTest
{
    [Fact]
    public void ShouldShowEmptyFields()
    {
        new Minefield(new [] { "." }).CalculateHints()
            .Should().Equals(new [] { "0" });
    }
}