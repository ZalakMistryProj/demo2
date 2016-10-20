import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JButton;
	import javax.swing.AbstractAction;
	import javax.swing.Action;
	import javax.swing.ImageIcon;
	import javax.swing.JPanel;
	import javax.swing.SwingUtilities;
	import javax.swing.event.MenuListener;
	import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Event;
	import java.awt.GridLayout;
	import java.awt.MenuBar;
	import java.awt.event.*;

	
public class Restaurantmenu extends JFrame
{
		public Restaurantmenu()
		{
			
			JFrame frame=new JFrame();
			
			JMenuBar menubar=new JMenuBar();
			frame.setJMenuBar(menubar);
			
			//menuitems,buttons,labels
			
			//home 
			JMenu home=new JMenu("Home");
			menubar.add(home);
			JMenuItem homemenu=new JMenuItem("Home");
			home.add(homemenu);
			JMenuItem about=new JMenuItem("About Us");
			home.add(about);
			JMenuItem contactus=new JMenuItem("Contact Us");
			home.add(contactus);
			
			JPanel homepanel,aboutpanel,contactpanel;
			homepanel=new JPanel();
			home.add(homepanel);
			aboutpanel=new JPanel();
			home.add(homepanel);
			contactpanel=new JPanel();
			home.add(homepanel);
			
			JButton homebtn,homebtn1,homebtn2,homebtn3,homebtn4;
			homebtn=new JButton();
			homebtn1=new JButton();
			homebtn2=new JButton();
			homebtn3=new JButton();
			homebtn4=new JButton();
			
			JLabel homelbl,homelbl1,homelbl2,homelbl3,homelbl4;
			
			homelbl=new JLabel("Soups and Salads");
			homelbl1=new JLabel("Let's treat yourself today with your choice of meal ");
			homelbl2=new JLabel("Start your party with our special Apetisers");
			homelbl3=new JLabel("Not full yet try our delicious Deserts");
			homelbl4=new JLabel("Lets enjoy your day with our special beverages");
			
			JLabel aboutlbl,aboutlbl1,aboutlbl2,aboutlbl3,aboutlbl4,aboutlbl5,aboutlbl6;
			aboutlbl=new JLabel();
			aboutlbl1=new JLabel("JAVA");
			aboutlbl2=new JLabel("We love to talk about story...");
			aboutlbl3=new JLabel("Starts in Sepetember 2015, by Mr.xxx ");
			aboutlbl4=new JLabel("He is good cook and his friends recomended him to open an restuarant");
			aboutlbl5=new JLabel("and here he it is..");
			aboutlbl6=new JLabel("We hope you enjoy our food");
			
			JLabel contactlbl,contactlbl1,contactlbl2,contactlbl3;
			contactlbl=new JLabel();
			contactlbl1=new JLabel("Reach us on: +(123)484-6399");
			contactlbl2=new JLabel("Find us at:");
			contactlbl3=new JLabel("5830 S Mopac Expressway, Fremont,CA,94538");
			
			//Drinks
			
			JMenu drinks=new JMenu("Drinks");
			menubar.add(drinks);
			
			JMenuItem acdrinks=new JMenuItem("Alcoholic Drinks");
			drinks.add(acdrinks);
			
			JMenuItem nonacdrinks=new JMenuItem("House Drinks");
			drinks.add(nonacdrinks);
			JPanel drinkspanel,alchoholicpanel,nonalchoholicpanel;
			
			drinkspanel=new JPanel();
			drinks.add(drinkspanel);
			alchoholicpanel=new JPanel();
			drinks.add(drinkspanel);
			nonalchoholicpanel=new JPanel();
			drinks.add(drinkspanel);
			
			JButton drinksbtn,acdbtn1,acdbtn2,acdbtn3;
			
			drinksbtn=new JButton();
			acdbtn1=new JButton();
			acdbtn2=new JButton();
			acdbtn3=new JButton();
			
			JLabel drinkslbl,drinkslbl1,drinkslbl2,drinkslbl3,drinkslbl4,drinkslbl5,drinkslbl6;
			
			drinkslbl=new JLabel("Beers");
			drinkslbl1=new JLabel("Marghrita");
			drinkslbl2=new JLabel("Cocktailmix");
			drinkslbl3=new JLabel();
			drinkslbl4=new JLabel("Quivi punch");
			drinkslbl5=new JLabel("Blackberry");
			drinkslbl6=new JLabel("Mango delight");
			
			//Appetisers
			
			JMenu appetiser=new JMenu("Appetiser");
			menubar.add(appetiser);
			JMenuItem soups=new JMenuItem("Soups and Salads");
			appetiser.add(soups);
			JMenuItem breads=new JMenuItem("Bread base");
			appetiser.add(breads);
			
			JPanel breadpanel,soupspanel;
			
			breadpanel=new JPanel();
			soupspanel=new JPanel();

			JLabel apetiserlbl,apetiserlbl1,apetiserlbl2,saladapp1;
			
			apetiserlbl=new JLabel("Green Vegetables Salad");
			apetiserlbl1=new JLabel();
			
			JLabel soupapp1,soupapp11,soupapp2,soupapp3,soupapp4,salad1app1,saladapp2,saladapp3;
			soupapp1=new JLabel("Creamy Tomatoe:ingrediants tomatoes,garlic,parsely,basils,cream and cheese");
			//soupapp11=new JLabel("");
			soupapp2=new JLabel("");
			soupapp3=new JLabel();
			
			saladapp1=new JLabel();
			saladapp2=new JLabel();
			saladapp3=new JLabel();
			
			JLabel bread1,bread2,bread3;
			
			bread1=new JLabel("Brachetto:ingrediants bread,garlic,tomatoes,cheese");
			bread2=new JLabel("");
			bread3=new JLabel();
			
			//Mainentries
			
			JMenu mainentry=new JMenu("Mainentry");
			menubar.add(mainentry);
			JMenuItem vegetarian=new JMenuItem("Vegetarian");
			mainentry.add(vegetarian);
			JMenuItem nonvegetarian=new JMenuItem("Nonvegetarian");
			mainentry.add(nonvegetarian);
			
			JPanel mainentrypanel,vegpanel,nonvegpanel;
			
			mainentrypanel=new JPanel();
			vegpanel=new JPanel();
			mainentry.add(mainentrypanel);
			
			nonvegpanel=new JPanel();
			mainentry.add(mainentrypanel);
			

			JButton mainentrybtn;
			mainentrybtn=new JButton();
			
			JLabel veg1,veg2,veg3;

			veg1=new JLabel("Lasagne:green vegetables with layers of cheese and sause");
			veg2=new JLabel("Pizza:choose your choice of vegetables");
			veg3=new JLabel("Eggplant Parmasean");
			
			JLabel nonveg1,nonveg2,nonveg3;
		
			nonveg1=new JLabel("Chicken parmasean");
			nonveg2=new JLabel("");
			nonveg3=new JLabel();
			
			
			//Deserts
			
			JMenu desert=new JMenu("Desert");
			menubar.add(desert);
			JMenuItem italiande=new JMenuItem("Italiandeserts");
			desert.add(italiande);
			
			
			JPanel desertspanel;
			
			desertspanel=new JPanel();
		
			JButton desertsbtn;
			
			desertsbtn=new JButton();
				
			JLabel desertlbl,desertlbl1,desertlbl2;
			
			desertlbl=new JLabel("Choose your favorite flavor of milkshake with scoop of ice-cream");
			desertlbl1=new JLabel("Try three layered of cake");
			desertlbl2=new JLabel("A rich vanila cake with soft touch of redvelvet");
			
			//Home window
			
			GridLayout homegrid=new GridLayout(5,2);
			homepanel.setLayout(homegrid);
			
			homemenu.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 frame.setContentPane(homepanel);
					 homepanel.revalidate();
				}
			});
			
			
			homebtn.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\salad.png"));
			homebtn1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\imagesPMNL75FU.jpg"));
			homebtn2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\app1.png"));
			homebtn3.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\untitled.png"));
			homebtn4.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\drink 1.jpg"));
			
			homepanel.add(homebtn4);
			homepanel.add(homelbl4);
			homepanel.add(homebtn);
			homepanel.add(homelbl);
			homepanel.add(homebtn2);
			homepanel.add(homelbl2);
			homepanel.add(homebtn1);
			homepanel.add(homelbl1);
			homepanel.add(homebtn3);
			homepanel.add(homelbl3);
			
			
			homebtn.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 
					 frame.setContentPane(soupspanel);
					 soupspanel.revalidate();
			            
				}
			});
			
			homebtn1.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 
					 frame.setContentPane(vegpanel);
					 vegpanel.revalidate();
			            
				}
			});
			
			homebtn2.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 
					 frame.setContentPane(breadpanel);
					 breadpanel.revalidate();
			            
				}
			});
			homebtn3.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 
					 frame.setContentPane(desertspanel);
					 desertspanel.revalidate();
			            
				}
			});
			homebtn4.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 
					 frame.setContentPane(alchoholicpanel);
					 alchoholicpanel.revalidate();
			            
				}
			});
			
			//About us window
			about.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 frame.setContentPane(aboutpanel);
					 aboutpanel.revalidate();
				}
			});
			
			aboutlbl.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\restaurant.png"));
			
			
			
			//aboutpanel.add(aboutlbl1);
			aboutpanel.add(aboutlbl2);
			aboutpanel.add(aboutlbl3);
			aboutpanel.add(aboutlbl4);
			aboutpanel.add(aboutlbl5);
			aboutpanel.add(aboutlbl6);
			aboutpanel.add(aboutlbl);
			
			//Contact us window
			contactus.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					 frame.setContentPane(contactpanel);
					 contactpanel.revalidate();
				}
			});
			
			contactlbl.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\restaurant.png"));
			contactpanel.add(contactlbl);
			contactpanel.add(contactlbl1);
			//contactpanel.add(contactlbl2);
			contactpanel.add(contactlbl3);
			
			//Drinks window
			
			GridLayout drinkgrid=new GridLayout(3,2);
			alchoholicpanel.setLayout(drinkgrid);
			
			acdrinks.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					frame.setContentPane(alchoholicpanel);
					alchoholicpanel.revalidate();
					
				}
			});
			
			drinkslbl.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\beers.jpg"));
			drinkslbl1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\marghrita.jpg"));
			drinkslbl2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\marghrita1.jpg"));
			drinkslbl3.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\special4.jpg"));
			
			alchoholicpanel.add(drinkslbl);
			alchoholicpanel.add(drinkslbl1);
			alchoholicpanel.add(drinkslbl2);
			//alchoholicpanel.add(drinkslbl3);
			
			nonalchoholicpanel.setLayout(drinkgrid);
			
			nonacdrinks.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					frame.setContentPane(nonalchoholicpanel);
					nonalchoholicpanel.revalidate();
					
				}
			});
			
			drinkslbl4.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\special2.jpg"));
			drinkslbl5.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\special 3.jpg"));
			drinkslbl6.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\marghrita3.jpg"));
			
			
			nonalchoholicpanel.add(drinkslbl4);
			nonalchoholicpanel.add(drinkslbl5);
			nonalchoholicpanel.add(drinkslbl6);
		
			//Appetisers windows
			
			GridLayout appegrid=new GridLayout(2,2);
			breadpanel.setLayout(appegrid);
			
			breads.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					frame.setContentPane(breadpanel);
					breadpanel.revalidate();
					
				}
			});
			
			bread1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\app2.jpg"));
			bread2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\app1.png"));
		
		
			breadpanel.add(bread1);
			breadpanel.add(bread2);

			soupspanel.setLayout(appegrid);
			soups.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					frame.setContentPane(soupspanel);
					soupspanel.revalidate();
					
				}
			});
			
			soupapp1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\soup3.jpg"));
			soupapp2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\soup2.png"));
			soupapp3.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\soup1.png"));
			saladapp1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\salad1.jpg"));
			saladapp2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\salad3.jpg"));
			saladapp3.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\soup4.jpg"));
			
		
			soupspanel.add(soupapp1);
			soupspanel.add(saladapp2);
			soupspanel.add(soupapp2);
			soupspanel.add(soupapp3);
			soupspanel.add(saladapp1);
			soupspanel.add(saladapp3);
			
			//Mainentry window
			
			GridLayout maingrid=new GridLayout(2,2);
			
			vegpanel.setLayout(maingrid);
			
			vegetarian.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					frame.setContentPane(vegpanel);
					vegpanel.revalidate();
					
				}
			});
			
			veg1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\lasagne1.jpg"));
			veg2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\images2OOU09GZ.jpg"));
			vegpanel.add(veg1);
			vegpanel.add(veg2);
			
			
			nonvegpanel.setLayout(maingrid);
			
			nonvegetarian.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					frame.setContentPane(nonvegpanel);
					nonvegpanel.revalidate();
					
				}
			});
			
			nonveg1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\Hellmanns-Chicken-Challenge-5.jpg"));
			nonveg2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\images2OOU09GZ.jpg"));
			nonvegpanel.add(nonveg1);
			nonvegpanel.add(nonveg2);
			
			italiande.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent args0) 
				{
					frame.setContentPane(desertspanel);
					desertspanel.revalidate();
				}
			});
	       //Desert window
			
			GridLayout drinksgrid=new GridLayout(3,2);
			desertspanel.setLayout(drinksgrid);
			
			desertlbl.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\so-good-gelato-R082446-ss.jpg"));
			desertlbl1.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\untitled.png"));
			desertlbl2.setIcon(new ImageIcon("C:\\Users\\zalak\\Desktop\\Food\\imagesO5F6Q9M5.jpg"));
			
			desertspanel.add(desertlbl);
			desertspanel.add(desertlbl1);
			desertspanel.add(desertlbl2);
			desertspanel.add(desertlbl,BorderLayout.CENTER);
			
		
			 	frame.setContentPane(homepanel);
			 	frame.setSize(550,700);
			 	frame.setTitle("Welcome to JAVA Restaurant..");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setLocationRelativeTo(null); 
		        frame.setVisible(true);
		}
		
		public static void main(String[] args)
		{
			
			SwingUtilities.invokeLater(new Runnable()
			{
	            public void run()
	            {
	                new Restaurantmenu();
	            }
	        });
			
		}
		
}


