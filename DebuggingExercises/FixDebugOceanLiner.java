public abstract class FixDebugOceanLiner extends FixDebugBoat
{
   public FixDebugOceanLiner()
   {
      super("ocean liner ");
   }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void power()
   {
      super.power = "four engines";
   }
}
